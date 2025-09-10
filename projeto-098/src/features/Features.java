package features;

import java.util.List;
import java.util.Scanner;

public class Features {
	
	public static void filterNamesByFirstLetter(Scanner sc, List<String> names) {
		
		System.out.print("Insira a letra: ");
		char firstLetter = sc.nextLine().toLowerCase().charAt(0);
		
		names.stream()
			.filter(n -> n.toLowerCase().charAt(0) == firstLetter)
			.forEach(System.out::println);
	}
	
	public static void countNamesByAmountOfCharacters (Scanner sc, List<String> names) {
		
		System.out.print("Insira a quantidade de caracteres: ");
		int amountCharacters = sc.nextInt();
		sc.nextLine();
		
		Long amountNames = names.stream()
			.filter(n -> n.length() > amountCharacters)
			.count();
		
		System.out.println(amountNames);
	}
	
	public static void orderListAndToUpperCase (Scanner sc, List<String> names) {
		
		names.stream()
			.map(n -> n.toUpperCase())
			.sorted()
			.forEach(System.out::println);;
	}

}
