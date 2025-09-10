package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Book;

public class ReadBooks {
	
	public static List<Book> read(Scanner sc) {
		
		List<Book> books = new ArrayList<>();
		
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.print("Insira o caminho do arquivo: ");
			String path = sc.nextLine();
			
			try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
				
				String line;
				
				while((line = reader.readLine()) != null) {
					
					String[] fields = line.split(",");
					
					String title = fields[0];
					String author = fields[1];
					Integer year = Integer.parseInt(fields[2]);
					String genre = fields[3];
					
					books.add(new Book(title, author, year, genre));
				}
				
				repeat = false;
				
			} catch (IOException e) {
				System.out.println("Url incorreta!\n");
			}
			
		}
		
		return books;
	}

}
