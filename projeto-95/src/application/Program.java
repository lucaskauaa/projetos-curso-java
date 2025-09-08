package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
			
			List<Product> list = new ArrayList<>();
			
			String lines;
			
			while((lines = reader.readLine()) != null) {
				
				String[] fields = lines.split(",");
				
				String name = fields[0];
				
				Double price = Double.parseDouble(fields[1]);
				
				list.add(new Product(name, price));
			}
			
			double avg = list.stream()
					.map(x -> x.getPrice())
					.reduce(0.0, (x, y) -> x + y / list.size());
			
			System.out.printf("Avarage price: %.2f%n", avg);
			
			List<String> names = list.stream()
				.filter(x -> x.getPrice() < avg)
				.map(n -> n.getName())
				.sorted((p1, p2) -> p2.compareTo(p1))
				.collect(Collectors.toList());
			
			names.stream().forEach(System.out::println);
				
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
}