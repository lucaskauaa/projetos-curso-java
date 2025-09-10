package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.50));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.80));
		
//		Predicate<Product> productPredicate = p -> p.getPrice() >= 100.0;
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}