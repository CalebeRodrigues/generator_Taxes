package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Tax_People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Tax_People> tax = new ArrayList<>();


		System.out.print("Enter the number of tax payers: ");
		int n = scanner.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c): ");
			char op = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Anual income: ");
			Double renda = scanner.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = scanner.nextDouble();
				tax.add(new Fisica(name, renda, gastoSaude));
			}
			else if(op == 'c') {
				System.out.print("Number of employees: ");
				int nFuncionarios = scanner.nextInt();
				tax.add(new Juridica(name, renda, nFuncionarios));
			}
			
		}
		
		System.out.println();
		System.out.println("Taxes PAID: ");
		for(Tax_People x : tax) {
			System.out.println(x.ToString());
		}
		
		Double total = 0.00;
		
		for(Tax_People x : tax) {
			total += x.calculoImposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f",total));
		scanner.close();
	}

}
