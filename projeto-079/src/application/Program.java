package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int amountValues = sc.nextInt();
		
		PrintService<Integer> printService = new PrintService<>();
		
		for (int i = 0; i < amountValues; i++) {
			printService.addValue(sc.nextInt());
		}
		
		printService.print();
		
		Integer x = printService.first();
		
		System.out.println("First: " +  x);
		
		sc.close();

	}

}
