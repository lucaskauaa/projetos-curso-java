package utils;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import entities.Sale;

public class SalesDashboard {
	
	public static void totalRevenuePerCustomer(List<Sale> sales) {
		
		Map<String, List<Sale>> clients = sales.stream()
				.collect(Collectors.groupingBy(s -> s.getClient()));
		
		for (String client : clients.keySet()) {
			
			System.out.print(client + ": ");
			
			Double totalRevenue = clients.get(client)
					.stream()
					.map(s -> s.getQuantity() * s.getValue())
					.reduce(0.0, (s1, s2) -> s1 + s2);
				
			System.out.printf("R$ %.2f%n", totalRevenue);
		}
		
	}
	
	public static void bestSellingProduct(List<Sale> sales) {
		
		Map<String, List<Sale>> products = sales.stream()
			.collect(Collectors.groupingBy(s -> s.getProduct()));
		
		String bestSellingProduct  = "";
		int bestSellingQuantity = 0;
		
		for (String product : products.keySet()) {
			
			Integer totalQuantity = products.get(product).stream()
				.map(s -> s.getQuantity())
				.reduce(0, (s1, s2) -> s1 + s2);
			
			if (totalQuantity > bestSellingQuantity) {
				bestSellingProduct = product;
				bestSellingQuantity = totalQuantity;
			}
			
		}
		
		System.out.println("Produto mais vendido: " + bestSellingProduct + ", total de unidades vendidas: "  + bestSellingQuantity);
		
	}
	
	public static void groupSalesByDate (List<Sale> sales) {
		
		Map<Integer, List<Sale>> salesByYear = sales
				.stream()
				.collect(Collectors.groupingBy(s -> s.getDate().getYear()));
		
		for (Integer year : salesByYear.keySet()) {
			
			System.out.println("Ano " + year + ": ");
			
			Map<Month, List<Sale>> salesByMonth = salesByYear.get(year)
					.stream()
					.collect(Collectors.groupingBy(s -> s.getDate().getMonth()));
			
			Map<Month, List<Sale>> x = new TreeMap<>(salesByMonth);
				
			for (Month month : x.keySet()) {
				
				System.out.println("\n" + month + "/" + year + ": ");
				
				salesByMonth.get(month)
					.stream()
					.forEach(System.out::println);
			}
		}
		
	}
	
	public static void calculateAvarageTicket (List<Sale> sales) {
		
		Double totalRevenue = sales
				.stream()
				.map(s -> s.getQuantity() * s.getValue())
				.reduce(0.0, (s1, s2) -> s1 + s2);
		
		System.out.printf("Ticket médio: R$ %.2f%n", totalRevenue / sales.size());
		
	}
}



