package application;

import devices.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner("Olá Mundo");
		
		sc1.scan(sc1.processDoc());
		
	}
}
