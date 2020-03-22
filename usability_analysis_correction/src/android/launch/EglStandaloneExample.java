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

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;

/**
 * This example demonstrates using the Epsilon Generation Language, the M2T
 * language of Epsilon, in a stand-alone manner
 * 
 * @author Dimitrios Kolovos
 */
public class EglStandaloneExample extends EpsilonStandaloneExample {
	private String transformation;
	private String targetFile;
	private List<IModel> models;

	/**
	 * Instead of the context we require the loader, since in EGL the module
	 * and the context are created together and we need to use both
	 * when running the transformation
	 */
	public EglStandaloneExample(List<IModel> models, String transformation,
			String targetFile) {
		this.models = models;		
		this.transformation = transformation;
		this.targetFile = targetFile;
	}
	
	public List<IModel> getModels() {
		return models;
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public String getSource() throws Exception {
		return transformation;
	}

	@Override
	public void postProcess() {
		super.postProcess();
		
		// Here we write the output of the transformation in the target file
		try {
			PrintWriter out = new PrintWriter(targetFile);
			out.print(result.toString());
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
