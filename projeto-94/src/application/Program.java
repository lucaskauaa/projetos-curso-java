package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.50));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.80));

		ProductService ps = new ProductService();

		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);

		System.out.println(sum);
	}

}