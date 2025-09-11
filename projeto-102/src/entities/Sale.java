package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Sale {
	
	private String customer;
	private String product;
	private Integer quantity;
	private Double value;
	private LocalDate date;
	
	public Sale(String client, String product, Integer quantity, Double value, LocalDate date) {
		this.customer = client;
		this.product = product;
		this.quantity = quantity;
		this.value = value;
		this.date = date;
	}

	public String getClient() {
		return customer;
	}

	public void setClient(String client) {
		this.customer = client;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, date, product, quantity, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(date, other.date)
				&& Objects.equals(product, other.product) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder text = new StringBuilder();
		
		text.append("\nCliente: " + customer + "\n");
		text.append("Produto: " + product + "\n");
		text.append("Quantidade: " + quantity + "\n");
		text.append("Valor unitário: R$ " + String.format("%.2f%n", value));
		text.append("Data: " + date.format(dateFormat));
		
		return text.toString();
	}

}
