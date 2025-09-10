package utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Book;

public class LibraryFeatures {

	public static void getBooksByAuthor(Scanner sc, List<Book> books) {
		
		System.out.print("Insira o nome do autor: ");
		String author = sc.nextLine();
		
		List<Book> booksOfAuthor = books.stream()
				.distinct()
				.filter(b -> b.getAuthor().equals(author))
				.collect(Collectors.toList());
		
		if (booksOfAuthor.isEmpty()) {
			System.out.println("Não há nenhum livro desse altor na lista");
		} else {
			booksOfAuthor.stream()
				.forEach(System.out::println);
		}
		
	}
	
	public static void groupBooksByGenre(List<Book> books) {
		
		Map<String, List<Book>> booksGroupedByGenre = books.stream()
				.distinct()
				.collect(Collectors.groupingBy(b -> b.getGenre()));
		
		for (String bookGender : booksGroupedByGenre.keySet()) {
			
			System.out.println("\nGênero: " + bookGender + "\n");
			
			booksGroupedByGenre.get(bookGender).stream()
				.forEach(System.out::println);
		}
	}
	
	public static void getFiveOlderBooks (List<Book> books) {
		
		books.stream()
			.distinct()
			.sorted((b1, b2) -> b1.getYear().compareTo(b2.getYear()))
			.limit(5)
			.forEach(System.out::println);
	}

}
