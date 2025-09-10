package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem (OrderItem orderItem) {
		items.add(orderItem);
	}
	
	public void removeItem (OrderItem orderItem) {
		items.remove(orderItem);
	}
	
	public Double total () {
		Double total = 0.0;
		
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder text = new StringBuilder();
		
		text.append("ORDER SUMMARY: \n");
		text.append("Order moment: ");
		text.append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
		text.append("Order status: ");
		text.append(status + "\n");
		text.append("Client: ");
		text.append(client.getName() + " ");
		text.append(client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - ");
		text.append(client.getEmail() + "\n");
		text.append("Order items: \n");
		
		for (OrderItem item : items) {
			text.append(item.getProduct().getName() + ", ");
			text.append("$" + item.getPrice() + ", ");
			text.append("Quantity: " + item.getQuantity() + ", ");
			text.append("Subtotal: $" + String.format("%.2f", item.subTotal()) + "\n");
		}
		
		text.append("Total price: $" + String.format("%.2f", total()));
		
		return text.toString();
	}
}
