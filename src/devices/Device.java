package devices;

public abstract class Device {
	
	protected String doc;

	public Device(String doc) {
		this.doc = doc;
	}
	
	public abstract String processDoc();
}
