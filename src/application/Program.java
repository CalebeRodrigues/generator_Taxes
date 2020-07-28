package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Tax_People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Tax_People tax;
		
		tax = new Fisica("Alex", 50000.00, 2000.00);
		
		System.out.println(tax.calculoImposto());
		
		scanner.close();
	}

}
