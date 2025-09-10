package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String filePath = sc.nextLine();
		
		Map<String, Integer> voting = new HashMap<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				
				String[] elements = line.split(",");
				
				String name = elements[0];
				
				int count = Integer.parseInt(elements[1]);
				
				if (voting.containsKey(name)) {
					count += voting.get(name);
				} 
				
				voting.put(name, count);
			}
			
			for (String key : voting.keySet()) {
				System.out.println(key + ": " + voting.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}