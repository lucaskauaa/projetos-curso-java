package utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.Product;
import entities.enums.ProductCategory;

public class Display {
	
	public static void productsGroupedByCategory (List<Product> products) {

		System.out.println("\nProdutos agrupados por categoria: ");

		Map<ProductCategory, List<Product>> productsGroupedByCategory = ProductCatalog.groupingByCategory(products);

		for (ProductCategory category : productsGroupedByCategory.keySet()) {

			System.out.println("\n" + category + ":");
			productsGroupedByCategory.get(category).stream().forEach(System.out::println);
		}

	}

	public static void avaragePriceByCategory (List<Product> products) {

		System.out.println("\nPreço médio por categoria:\n");

		Map<ProductCategory, Double> avaragePriceByCategory = ProductCatalog.avaragePriceForCategory(products);

		for (ProductCategory category : avaragePriceByCategory.keySet()) {

			double avaragePrice = avaragePriceByCategory.get(category);

			System.out.println(category + ": " + String.format("%.2f", avaragePrice));
		}
	}

	public static void productsAboveACertainValue (Scanner sc, List<Product> products) {
		
		System.out.println("\nFiltrar produto acima de um valor x:");
		System.out.print("\nInsira o valor: ");
		Double amount = sc.nextDouble();
		sc.nextLine();

		List<Product> productsAboveACertainValue = ProductCatalog.filterProductsAboveACertainValue(products, amount);

		productsAboveACertainValue.stream().forEach(System.out::println);
	}

}
