package menus;

import java.util.List;
import java.util.Scanner;

import features.Features;

public class Menu {
	
	public static void showMenu(Scanner sc, List<String> names) {
		
		int choice;
		
		do {
			StringBuilder text = new StringBuilder();

			text.append("\nO que você deseja fazer ?\n");
			text.append("[1] Filtrar nomes que começam com uma letra específica.\n");
			text.append("[2] Contar quantos têm mais de X caracteres.\n");
			text.append("[3] Gerar uma lista ordenada e em maiúsculas.\n");
			text.append("[4] Sair\n");
			text.append("\nResposta: ");

			System.out.print(text.toString());
			choice = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(choice) {
			case 1 -> Features.filterNamesByFirstLetter(sc, names);
			case 2 -> Features.countNamesByAmountOfCharacters(sc, names);
			case 3 -> Features.orderListAndToUpperCase(sc, names);
			case 4 -> System.out.println("Programa encerrado.");
			default -> System.out.println("Valor inválido!");
			}
			
		} while(choice != 4) ;
			
	}

}
