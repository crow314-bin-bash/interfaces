package devices;

import devices.interfaces.Scannable;

public class Scanner extends Device implements Scannable {
	
	public Scanner(String doc) {
		super (doc);
	}
	
	
	@Override
	public String processDoc() {
		System.out.println("O Scanner está processando o documento [" + doc + "], aguarde...");
		return doc;
	}
	
	@Override
	public void scan(String doc) {
		System.out.println("O documento [" + doc + "] no Scanner foi scaneado!");
		
	}
}
