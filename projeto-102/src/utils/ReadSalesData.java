package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Sale;

public class ReadSalesData {
	
	public static List<Sale> read(Scanner sc) {
		
		List<Sale> sales = new ArrayList<>();
		
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.print("Insira o caminho do arquivo: ");
			String path = sc.nextLine();
			
			try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
				
				String line;
				
				while((line = reader.readLine()) != null) {
					
					String[] fields = line.split(",");
					
					String client = fields[0];
					String product = fields[1];
					Integer quantity = Integer.parseInt(fields[2]);
					Double value = Double.parseDouble(fields[3]);
					LocalDate date = LocalDate.parse(fields[4]);
					
					sales.add(new Sale(client, product, quantity, value, date));
				}
				
				repeat = false;
				
			} catch (IOException e) {
				System.out.println("Url incorreta!\n");
			}
			
		}
		
		return sales;
	}

}
