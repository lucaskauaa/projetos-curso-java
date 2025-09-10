package model.util;

import java.util.function.Function;

import model.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product t) {
		return t.getName().toUpperCase();
	}
}
