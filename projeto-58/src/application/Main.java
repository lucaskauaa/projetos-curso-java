package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();

		Client client = new Client(name, email, LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int amountOfItems = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < amountOfItems; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(product, productQuantity);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
