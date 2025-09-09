package application;

import java.util.List;
import java.util.Scanner;

import menus.Menu;
import services.ReaderService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> names = ReaderService.read(sc);
		
		names.stream().forEach(System.out::println);
		
		Menu.showMenu(sc, names);
		
		sc.close();
	
	}

}