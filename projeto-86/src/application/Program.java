package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String filePath = sc.nextLine();
		
		Set<User> users = new HashSet<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] elements = line.split(" ");
				
				users.add(new User(elements[0]));
				
			}
			
			System.out.println("Total users: " + users.size());
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
