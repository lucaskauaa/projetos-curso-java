package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderService {
	
	public static List<String> read(Scanner sc) {
		
		List<String> names = new ArrayList<>();
		
		boolean readAgain = true;
		
		while(readAgain) {
			
			System.out.print("Insira o caminho do arquivo com a lista de nomes: ");
			String path = sc.nextLine();
			System.out.println();
			
			try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
				
				String lines;
				
				while((lines = reader.readLine()) != null) {
					names.add(lines);
				}
				
				readAgain = false;
				
			} catch (IOException e) {
				System.out.println("URL incorreta!\n");
			}
		}
		
		return names;
		
	}
}
