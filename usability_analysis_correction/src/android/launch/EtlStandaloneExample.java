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


import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.eol.models.IModel;


/**
 * This example demonstrates using the Epsilon Transformation Language, the M2M
 * language of Epsilon, in a stand-alone manner
 * 
 * @author Dimitrios Kolovos
 */
public class EtlStandaloneExample extends EpsilonStandaloneExample {
	private String transformation;
	private List<IModel> models;

	/**
	 * We create the Etl standalone from the transformation and the loaded
	 * models needed
	 */
	public EtlStandaloneExample(List<IModel> models, String transformation) {
		this.models = models;		
		this.transformation = transformation;
	}	

	public List<IModel> getModels() {
		return models;
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public String getSource() throws Exception {
		return transformation;
	}
}
