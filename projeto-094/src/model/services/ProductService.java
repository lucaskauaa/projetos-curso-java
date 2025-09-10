package model.services;

import java.util.List;

import model.entities.Product;
import model.util.Test;

public class ProductService {
	
	public double filteredSum (List<Product> list, Test<Product> test) {
		
		double sum = 0;
		
		for (Product p : list) {
			if (test.filter(p)) {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}
