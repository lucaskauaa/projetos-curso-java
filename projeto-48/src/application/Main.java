package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int amountOfPeople = sc.nextInt();
		
		People[] people = new People[amountOfPeople];
		
		double totalHeight = 0.0;
		
		double peopleUnder16YearsOfAge = 0.0;
		
		
		for (int i = 0; i < people.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			people[i] = new People(name, age, height);
			
			totalHeight += height;
			
			if(age < 16) {
				peopleUnder16YearsOfAge++;
			}
		}
		
		double avarageHeight = (double) totalHeight / amountOfPeople;
		
		peopleUnder16YearsOfAge = peopleUnder16YearsOfAge / amountOfPeople * 100.00;
		
		System.out.println("");
		System.out.printf("Altura média: %.2f%n", avarageHeight);
		System.out.println("Pessoas com menos de 16 anos: " +  String.format("%.1f", peopleUnder16YearsOfAge) + "%");
		
		for (int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();
	}

}
