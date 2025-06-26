package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();

		System.out.print("Insira o nome do produto: ");
		product.name = sc.nextLine();
		System.out.print("Insira o preço do produto: ");
		product.price = sc.nextDouble();
		System.out.print("Insira a quantidade no estoque, do produto: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println("Quantos itens você quer adicionar ao estoque ?");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity); 
		
		System.out.println(product);
		
		System.out.println("Quantos itens você quer remover do estoque ?");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity); 
		
		System.out.println(product);
		
		sc.close();
	}

}
