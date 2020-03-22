package android.launch;

import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;

import api2mol.util.FileCreator;

/**
 * This is the class that will launch the injection of the usability rules
 * catalogue, obtaining the Analysis.etl m2m transformation from the model
 * defining the set of rules
 * 
 * @author Jose Manuel Cruz Zapata
 * 
 */
public class LaunchCatalogueInjection {
	/**
	 * Relative paths to all the files
	 */	
	private String catalogueMetamodel = "metamodel/usability_rules.ecore";
	private String rules2analysis = "transformation/Rules2Analysis.egl";
	
	private final static String catalogueModelDefault = "model/catalogue.xmi";
	private final static String analysisDefault = "transformation/Analysis.etl";	

	/**
	 * Launchs the catalogue injection process
	 * 
	 * @param catalogueModel
	 *            The model containing the catalogue of rules
	 * @param analysisTransformation
	 *            The resulting m2m transformation
	 */
	public void launchAndroidAnalysis(String catalogueModel,
			String analysisTransformation) {
		// Define all the models that will be loaded
		ModelData catalogue = new ModelData(catalogueModel, catalogueMetamodel,
				"Catalogue", true, false);

		// Get all the loaded models
		IModel catalogueM = ModelLoader.loadModel(catalogue);

		// Launch each transformation
		// For efficiency, as soon as it's not necessary we
		// individually dispose each loaded model
		try {
			System.out
					.println("Executing the rules2analysis transformation...");
			launchEglTransformation(rules2analysis, analysisTransformation,
					Arrays.asList(catalogueM));
			catalogueM.dispose();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// FileCreator.removeFiles();
	}

	/**
	 * In case the project is exported as a jar, it fails to load the resources
	 * from within the jar, so a previous step is required to copy those files
	 * in a temporary folder
	 * 
	 * @param catalogueModel
	 *            The model containing the catalogue of rules
	 * @param analysisTransformation
	 *            The resulting m2m transformation
	 * @param tempDir
	 *            The directory where all the temporary files will be created.
	 */
	public void launchAndroidAnalysis(String catalogueModel,
			String analysisTransformation, String tempDir) {
		FileCreator.setTempDir(tempDir);

		// Copy all the files from the jar to the temporary folder so they can
		// be loaded
		extractFromJar();

		launchAndroidAnalysis(catalogueModel, analysisTransformation);
	}

	/**
	 * From the jar relative paths we obtain absolute pahts to temporary files.
	 * This files can be new files or a copy if the file already exists inside
	 * the jar
	 */
	private void extractFromJar() {
		catalogueMetamodel = FileCreator.createFile(catalogueMetamodel)
				.getAbsolutePath();
		rules2analysis = FileCreator.createFile(rules2analysis)
				.getAbsolutePath();
	}

	/**
	 * Creates the module representing the EGL transformation and executes it
	 */
	private void launchEglTransformation(String transformation, String output,
			List<IModel> models) throws Exception {
		EglStandaloneExample stand = new EglStandaloneExample(models,
				transformation, output);
		stand.execute();
	}
	
	public static void main(String[] args) {
		LaunchCatalogueInjection launch = new LaunchCatalogueInjection();
		launch.launchAndroidAnalysis(catalogueModelDefault, analysisDefault);
	}
}
