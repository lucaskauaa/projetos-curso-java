package application;

import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int amountOfRooms = sc.nextInt();
		
		Rent[] rooms = new Rent[10];
		
		int c = 0;
		
		while (c < amountOfRooms) {
			System.out.println("Rent #" + (c + 1));
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc .nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomSelected = sc.nextInt();
			
			if(rooms[roomSelected] == null) {
				rooms[roomSelected] = new Rent(name, email);
			} else {
				System.out.println("This room has alredy been rented, please choose another room.");
				continue;
			}
			
			c++;
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}
		
		sc.close();
	}

}
