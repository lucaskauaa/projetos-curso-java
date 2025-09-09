package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

	public static List<String> read(Scanner sc) {
		
		List<String> lines = new ArrayList<>();
		
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.print("Insira o caminho do arquivo: ");
			String path = sc.nextLine();
			
			try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

				String line;

				while ((line = reader.readLine()) != null) {
					lines.add(line);
				}

				repeat = false;
			
			} catch (IOException e) {
				System.out.println("URL incorreta!");
			}
		}

		return lines;
	}

}
