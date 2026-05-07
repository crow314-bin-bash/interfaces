package devices;

import devices.interfaces.Printable;

public class Printer extends Device implements Printable {
	
	public Printer(String doc) {
		super (doc);
	}
	
	@Override
	public String processDoc() {
		System.out.println("A Impressora está processando o documento [" + doc + "], aguarde...");
		return doc;
	}
	
	@Override
	public void print(String doc) {
		System.out.println("O documento [" + doc + "] na Impressora foi impresso!");
		
	}
}
