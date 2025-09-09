package entities;

import entities.enums.ProductCategory;

public class Product {

	private String name;
	private ProductCategory category;
	private Double price;
	
	public Product(String name, ProductCategory category, Double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("R$ %.2f", price);
	}
	
}
