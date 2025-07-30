package program;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String folderPath = "C:\\Users\\Lucas Kauã\\Documents\\ti\\curso-java";
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		for (File file : files) {
			System.out.println(file);
		}
	
		boolean createdNewFolder = new File("C:\\Users\\Lucas Kauã\\Documents\\ti\\curso-java\\test").mkdir();
		
		System.out.println("Created new folder: " + createdNewFolder);
		
	}
}
