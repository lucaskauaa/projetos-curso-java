package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.enums.ProductCategory;
import utils.Display;
import utils.Reader;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		List<String> lines = Reader.read(sc);

		for (String line : lines) {

			String[] fields = line.split(",");

			String name = fields[0];
			ProductCategory category = ProductCategory.valueOf(fields[1]);
			Double price = Double.parseDouble(fields[2]);

			products.add(new Product(name, category, price));
		}

		Display.productsGroupedByCategory(products);

		Display.avaragePriceByCategory(products);
		
		Display.productsAboveACertainValue(sc, products);

		sc.close();
	}

}
