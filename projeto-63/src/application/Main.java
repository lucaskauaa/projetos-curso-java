package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayerList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int amountOfTaxPayers = sc.nextInt();
		
		for (int i = 0; i < amountOfTaxPayers; i++) {
			
			System.out.println("Tax prayer #" + (i + 1) + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char kindOfTaxPayer = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			switch(kindOfTaxPayer) {
			case 'i':
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				
				taxPayerList.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		Double totalTaxes = 0.0;
		
		for (TaxPayer taxPayer: taxPayerList) {
			System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
			
			totalTaxes += taxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
	}

}
