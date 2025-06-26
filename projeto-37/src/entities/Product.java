package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock () {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return ("\nNome: " + name + "\nPreço: R$ " + String.format("%.2f", price) + "\nQuantidade: " + quantity + "\nValor em estoque: R$ " + 		String.format("%.2f", totalValueInStock()));
	}
}
