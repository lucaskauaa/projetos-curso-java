package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {
	
	public static List<String> readFile (String path) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			
			return reader.lines()
				.collect(Collectors.toList());
			
		} catch (IOException e) {
			System.out.println("O arquivo não pôde ser encontrado!");
		}
		
		return Collections.emptyList();
	}

}
