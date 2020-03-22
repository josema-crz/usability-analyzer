package android.launch;

/**
 * This class groups all the information we need to know to load a model
 * using the Epsilon libraries.
 * 
 * @author Jose Manuel Cruz Zapata
 *
 */
public class ModelData {
	private String model;
	private String metamodel;
	private String name;
	private boolean read;
	private boolean store;

	
	public ModelData(String model, String metamodel, String name, boolean read,
			boolean store) {
		super();
		this.model = model;
		this.metamodel = metamodel;
		this.name = name;
		this.read = read;
		this.store = store;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isStore() {
		return store;
	}

	public void setStore(boolean store) {
		this.store = store;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMetamodel() {
		return metamodel;
	}

	public void setMetamodel(String metamodel) {
		this.metamodel = metamodel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
