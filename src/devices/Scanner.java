package devices;

import devices.interfaces.Scannable;

public class Scanner extends Device implements Scannable {
	
	public Scanner(String doc) {
		super (doc);
	}
	
	
	@Override
	public String processDoc() {
		System.out.println("Documento [" + doc + "] sendo processado, aguarde...");
		return doc;
	}
	
	public void scan(String doc) {
		System.out.println("O documento [" + doc + "] foi scaneado certinho!");
		
	}
}
