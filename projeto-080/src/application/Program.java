package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("File path: ");
		String strPath = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] elements = line.split(",");
				
				list.add(new Product(elements[0], Double.parseDouble(elements[1])));
			}
			
			System.out.println("Most expensive:");
			System.out.println(CalculationService.max(list));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
