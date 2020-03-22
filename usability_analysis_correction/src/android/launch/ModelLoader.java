package android.launch;

import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;


public class ModelLoader {

	public static IModel loadModel(ModelData model) {
		IModel imodel = null;
		try {
			imodel = createEmfModel(model.getName(), model.getModel(),
					model.getMetamodel(), model.isRead(), model.isStore());

		} catch (EolModelLoadingException e) {
			System.out.println("Error loading the model: " + e);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return imodel;
	}

	private static EmfModel createEmfModel(String name, String model,
			String metamodel, boolean readOnLoad, boolean storeOnDisposal)
			throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, new File(
				metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, new File(model).toURI()
				.toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
}
