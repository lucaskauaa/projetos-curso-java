package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.50));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.80));
		
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
//		List<String> names = list.stream().map(Product::upperCaseName).collect(Collectors.toList());
		
//		Function<Product, String> upperCaseName = p -> p.getName().toUpperCase();
		
//		List<String> names = list.stream().map(upperCaseName).collect(Collectors.toList());
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}