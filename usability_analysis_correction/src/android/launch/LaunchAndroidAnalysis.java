package android.launch;

import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;
import api2mol.util.FileCreator;

/**
 * This is the class that will launch the Android usability analysis process.
 * 
 * @author Jose Manuel Cruz Zapata
 * 
 */
public class LaunchAndroidAnalysis {
	/**
	 * Relative paths to all the files
	 */
	private String androidModel;
	private String androidMetamodel = "metamodel/resultEcore-ATL-Android.ecore";
	private String guiModel = "model/android_gui.xmi";
	private String guiMetamodel = "metamodel/gui.ecore";
	private String usabilityGuiModel = "model/usability_gui.xmi";
	private String usabilityGuiMetamodel = "metamodel/usability_gui.ecore";
	private String defectsModel = "model/gui_defects_analysis.xmi";
	private String defectsMetamodel = "metamodel/usability_defects.ecore";
	private String android2gui = "transformation/Android2GUI.etl";
	private String gui2usability = "transformation/GUI2Usability.etl";
	private String rules2analysis = "transformation/Rules2Analysis.egl";
	private String analysis = "transformation/Analysis.etl";
	private String defects2report = "transformation/Defects2AnalysisReport.egl";

	private final static String reportDefault = "report/analysis-report.html";
	private final static String androidModelDefault = "model/android_original.xmi";

	/**
	 * Launchs the usability analysis process, generating an html report with
	 * the defects found in the android GUI model.
	 * 
	 * @param androidModel
	 *            The result of the GUI injection process
	 * @param reportPath
	 *            The html that will contain the result of the analysis
	 */
	public void launchAndroidAnalysis(String androidModel, String reportPath) {
		this.androidModel = androidModel;

		// Define all the models that will be loaded
		ModelData android = new ModelData(androidModel, androidMetamodel,
				"Android", true, false);
		ModelData gui = new ModelData(guiModel, guiMetamodel, "GUI", false,
				true);
		ModelData usabilityGui = new ModelData(usabilityGuiModel,
				usabilityGuiMetamodel, "UsabilityGUI", false, true);
		ModelData defects = new ModelData(defectsModel, defectsMetamodel,
				"AnalysisDefects", false, true);

		// Get all the loaded models
		IModel androidM = ModelLoader.loadModel(android);
		IModel guiM = ModelLoader.loadModel(gui);
		IModel usabilityGuiM = ModelLoader.loadModel(usabilityGui);
		IModel defectsM = ModelLoader.loadModel(defects);

		// Launch each transformation
		// For efficiency, as soon as it's not necessary we
		// individually dispose each loaded model
		try {
			System.out.println("Executing the android2gui transformation...");
			launchEtlTransformation(android2gui, Arrays.asList(androidM, guiM));
			androidM.dispose();
			System.out.println("Executing the gui2usability transformation...");
			launchEtlTransformation(gui2usability,
					Arrays.asList(guiM, usabilityGuiM));
			System.out.println("Executing the analysis transformation...");
			launchEtlTransformation(analysis,
					Arrays.asList(guiM, usabilityGuiM, defectsM));
			guiM.dispose();
			usabilityGuiM.dispose();
			System.out
					.println("Executing the defects2report transformation...");
			launchEglTransformation(defects2report, reportPath,
					Arrays.asList(defectsM));
			defectsM.dispose();
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
	 * @param androidModel
	 *            The result of the GUI injection process
	 * @param tempDir
	 *            This directory will hold the temporary files that the process
	 *            requires. All the models, metamodels and transformations will
	 *            be copied here
	 * @param reportPath
	 *            The html that will contain the result of the analysis
	 */
	public void launchAndroidAnalysis(String androidModel, String reportPath,
			String tempDir) {
		FileCreator.setTempDir(tempDir);

		// Copy all the files from the jar to the temporary folder so they can
		// be
		// loaded
		extractFromJar();

		launchAndroidAnalysis(androidModel, reportPath);
	}

	/**
	 * From the jar relative paths we obtain absolute pahts to temporary files.
	 * This files can be new files or a copy if the file already exists inside
	 * the jar
	 */
	private void extractFromJar() {
		androidModel = FileCreator.createFile(androidModel).getAbsolutePath();
		androidMetamodel = FileCreator.createFile(androidMetamodel)
				.getAbsolutePath();
		guiModel = FileCreator.createFile(guiModel).getAbsolutePath();
		guiMetamodel = FileCreator.createFile(guiMetamodel).getAbsolutePath();
		usabilityGuiModel = FileCreator.createFile(usabilityGuiModel)
				.getAbsolutePath();
		usabilityGuiMetamodel = FileCreator.createFile(usabilityGuiMetamodel)
				.getAbsolutePath();
		defectsModel = FileCreator.createFile(defectsModel).getAbsolutePath();
		defectsMetamodel = FileCreator.createFile(defectsMetamodel)
				.getAbsolutePath();
		android2gui = FileCreator.createFile(android2gui).getAbsolutePath();
		gui2usability = FileCreator.createFile(gui2usability).getAbsolutePath();
		rules2analysis = FileCreator.createFile(rules2analysis)
				.getAbsolutePath();
		analysis = FileCreator.createFile(analysis).getAbsolutePath();
		defects2report = FileCreator.createFile(defects2report)
				.getAbsolutePath();
	}

	/**
	 * Creates the module representing the ETL transformation and executes it
	 */
	private void launchEtlTransformation(String transformation,
			List<IModel> models) throws Exception {
		EtlStandaloneExample stand = new EtlStandaloneExample(models,
				transformation);
		stand.execute();
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
		LaunchAndroidAnalysis launch = new LaunchAndroidAnalysis();
		launch.launchAndroidAnalysis(androidModelDefault,
				reportDefault);
	}
}
