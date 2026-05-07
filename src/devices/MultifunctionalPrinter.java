package devices;

import devices.interfaces.Printable;
import devices.interfaces.Scannable;

public class MultifunctionalPrinter extends Device implements Scannable, Printable {
	
	public MultifunctionalPrinter(String doc) {
		super(doc);
	}
	
	@Override
	public String processDoc() {
		System.out.println("A Multifuncional está processando o documento [" + doc + "], aguarde...");
		return doc;
	}
	
	@Override
	public void scan(String doc) {
		System.out.println("O documento [" + doc + "] na Multifuncional foi scaneado!");
	}
	
	@Override
	public void print(String doc) {
		System.out.println("O documento [" + doc + "] na Multifuncional foi impresso!");
	}
}
