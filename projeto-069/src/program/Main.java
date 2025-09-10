package program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\Users\\Lucas Kauã\\Documents\\ti\\curso-java\\text\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

}}
