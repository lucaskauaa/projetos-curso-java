package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the file path: ");
		String filePath = sc.nextLine();
		
		File path = new File(filePath);
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				
				String[] itens = line.split(",");
				
				String name = itens[0];
				Double price = Double.parseDouble(itens[1].trim());
				Integer quantity = Integer.parseInt(itens[2].trim());
				
				products.add(new Product(name, price, quantity));
				
			}
			
			boolean createdNewFolder = new File(path.getParent() + "\\out").mkdir();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.getParent() + "\\out\\summary.txt"))) {
			
			for (Product product : products) {
				writer.write(product.toString());
				writer.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
