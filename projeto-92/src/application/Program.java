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
		
//		Consumer<Product> consumerProd = p -> p.setPrice(p.getPrice() * 1.1);
		
		list.forEach(p -> {
			p.setPrice(p.getPrice() * 1.1);
		});
		
		list.forEach(System.out::print);
		
//		for (Product p : list) {
//			System.out.println(p);
//		}
		
	}

}