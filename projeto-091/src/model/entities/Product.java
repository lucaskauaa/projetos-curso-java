package model.entities;

public class Product implements Comparable<Product> {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
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
	
	public static boolean staticProductPredicate (Product p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean ProductPredicate () {
		return price >= 100.00;
	}

	@Override
	public int compareTo(Product other) {
		
		return name.compareTo(other.getName());
	}
	
	public String toString() {
		return name + ", " + price;
	}
	
}
