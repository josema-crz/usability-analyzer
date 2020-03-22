/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package android.launch;

import java.io.File;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.models.IModel;

public abstract class EpsilonStandaloneExample {
	protected IEolContext context;
	
	protected IEolExecutableModule module;
	
	protected Object result;
	
	public abstract IEolExecutableModule createModule();
	
	public abstract List<IModel> getModels();
	
	public abstract String getSource() throws Exception;	
	
	public void postProcess() {
		
	}
	
	public void execute() throws Exception {
		
		module = createModule();
		// Here we load the transformation
		module.parse(new File(getSource()));
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		
		// We put the loaded models in the context repository
		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		result = execute(module);
		postProcess();
		
		// When disposing the repository, the model files will be created
		//module.getContext().getModelRepository().dispose();
	}
	
	protected Object execute(IEolExecutableModule module) 
			throws EolRuntimeException {
		return module.execute();
	}	
}
