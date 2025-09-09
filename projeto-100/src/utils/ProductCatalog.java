package utils;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import entities.Product;
import entities.enums.ProductCategory;

public class ProductCatalog {

	public static Map<ProductCategory, List<Product>> groupingByCategory (List<Product> products) {
		
		return products.stream()
				.collect(Collectors.groupingBy(p -> p.getCategory()));
		
	}
	
	public static Map<ProductCategory, Double> avaragePriceForCategory (List<Product> products) {
		
		Map<ProductCategory, List<Product>> productsSparatedByCategory = groupingByCategory(products);
		
		Map<ProductCategory, Double> avaragePriceByCategory = new TreeMap<>();
		
		for (ProductCategory category : productsSparatedByCategory.keySet()) {
			
			List<Product> productList = productsSparatedByCategory.get(category);
			
			Double totalPrice = productList.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, (p1, p2) -> p1 + p2);
			
			Double avarage = totalPrice / productList.size();
			
			avaragePriceByCategory.put(category, avarage);
		}
		
		return avaragePriceByCategory;
		
	}
	
	public static List<Product> filterProductsAboveACertainValue (List<Product> products, Double amount) {
		
		return products.stream()
				.filter(p -> p.getPrice() > amount)
				.collect(Collectors.toList());
	}
}
