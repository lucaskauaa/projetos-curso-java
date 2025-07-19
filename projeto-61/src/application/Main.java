package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.importedProduct;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int amountOfProducts = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < amountOfProducts; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
		
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			switch(productType) {
			case 'c':
				productList.add(new Product(name, price));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				 
				productList.add(new importedProduct(name, price, customsFee));
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				
				productList.add(new UsedProduct(name, price, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
