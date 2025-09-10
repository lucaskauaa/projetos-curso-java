package application;

import java.util.List;
import java.util.Scanner;

import entities.Book;
import utils.LibraryFeatures;
import utils.ReadBooks;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Book> books = ReadBooks.read(sc);
		
		int choice;
		
		do {
			StringBuilder text = new StringBuilder();
			
			text.append("\nO que você deseja fazer?\n");
			text.append("[1] Buscar livros por autor.\n");
			text.append("[2] Agrupar livros por gênero.\n");
			text.append("[3] Mostrar os 5 livros mais antigos.");
			text.append("Resposta: ");
			
			System.out.println(text.toString());
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 -> LibraryFeatures.getBooksByAuthor(sc, books);
			case 2 -> LibraryFeatures.groupBooksByGenre(books);
			case 3 -> LibraryFeatures.getFiveOlderBooks(books);
			case 4 -> System.out.println("Programa encerrado.");
			default -> System.out.println("Insira um valor válido!");
			}
			
		} while (choice != 4);
		
		sc.close();

	}

}


