package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));
		
//		Comparator<Product> comp = new Comparator<Product>() {
//
//			@Override
//			public int compare(Product p1, Product p2) {
//				
//				return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
//			}
//			
//		};
		
//		Comparator<Product> comp = (p1, p2) -> {
//			return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
//		};
		
//		Comparator<Product> comp = (p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
		
		products.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));
		
		for (Product p : products) {
			System.out.println(p);
		}
	}

}
