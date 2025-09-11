package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Movie;

public class ReadMoviesData {
	
	public static List<Movie> read(Scanner sc) {
		
		List<Movie> movies = new ArrayList<>();
		
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.print("Insira o caminho do arquivo: ");
			String path = sc.nextLine();
			
			try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
				
				String line;
				
				while((line = reader.readLine()) != null) {
					
					String[] fields = line.split(",");
					
					String title = fields[0];
					String genre = fields[1];
					Double note = Double.parseDouble(fields[2]);
					
					movies.add(new Movie(title, genre, note));
				}
				
				repeat = false;
				
			} catch (IOException e) {
				System.out.println("Url incorreta!\n");
			}
		}
		
		return movies;
	}

}
