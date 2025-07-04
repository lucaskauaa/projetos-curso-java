package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos produtos você quer cadastrar: ");
		int n = sc.nextInt();
		System.out.println("");
		
		Product[] product = new Product[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Insira o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Insira o valor do produto: ");
			double price = sc.nextDouble();
			System.out.println("");
			
			product[i] = new Product(name, price);
		}
		
		double avaragePrice = 0.0;
		
		for (int i = 0; i < product.length; i++) {
			avaragePrice += product[i].getPrice();
		}
		
		avaragePrice /= n;
		
		System.out.printf("Preço médio = %.2f", avaragePrice);
		
		sc.close();
	}

}
