package application;

import devices.MultifunctionalPrinter;
import devices.Printer;
import devices.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner("Olá Mundo");
		Printer printer = new Printer("Toriel");
		MultifunctionalPrinter multifunctionalPrinter = new MultifunctionalPrinter("Revenge of the Fallen");
		
		System.out.println("----------------------------------- General Devices System v1.1a -----------------------------------\n");
		
		System.out.println("\n------------------------------------------ Operation Start -----------------------------------------\n");
		scanner.scan(scanner.processDoc());
		System.out.println("\n------------------------------------------- Operation End ------------------------------------------\n");
		
		System.out.println("\n------------------------------------------ Operation Start -----------------------------------------\n");
		printer.print(printer.processDoc());
		System.out.println("\n------------------------------------------- Operation End ------------------------------------------\n");
		
		System.out.println("\n------------------------------------------ Operation Start -----------------------------------------\n");
		multifunctionalPrinter.scan(multifunctionalPrinter.processDoc());
		System.out.println("\n------------------------------------------- Operation End ------------------------------------------\n");
		
		System.out.println("\n------------------------------------------ Operation Start -----------------------------------------\n");
		multifunctionalPrinter.print(multifunctionalPrinter.processDoc());
		System.out.println("\n------------------------------------------- Operation End ------------------------------------------\n");

	}
}
