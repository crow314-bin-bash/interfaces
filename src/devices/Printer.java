package devices;

public class Printer extends Device implements Printable {
	
	@Override
	public String processDoc(String doc) {
		System.out.println("Documento [" + doc + "] sendo processado, aguarde...");
		return doc;
	}
}
