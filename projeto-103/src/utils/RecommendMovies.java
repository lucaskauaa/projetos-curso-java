package utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Movie;

public class RecommendMovies {

	public static void listTop10Movies(List<Movie> movies) {

		movies.stream()
		.sorted((m1, m2) -> m2.getNote().compareTo(m1.getNote()))
		.limit(10)
		.forEach(System.out::println);
		
	}

	public static void groupMoviesByGenre(List<Movie> movies) {

		movies.stream()
			.collect(Collectors.groupingBy(m -> m.getGenre()))
			.forEach((genre, movie) -> {

			System.out.println("\n==========================================");
			System.out.println("Gênero: " + genre);
			movie.forEach(System.out::println);

		});
	}
	
	public static void recommendFilmsAboveAMinimumRatingInAGivenGenre (Scanner sc, List<Movie> movies) {
		
		System.out.print("Insira a nota mínima: ");
		double minimumGrade = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Insira o gênero: ");
		String genre = sc.nextLine();
		
		movies.stream()
			.filter(m -> m.getGenre().toLowerCase().equals(genre.toLowerCase()) && m.getNote() >= minimumGrade)
			.forEach(System.out::println);
		
	}
	
	public static void calculateAverageRatingByGender(List<Movie> movies) {
		
		Map<String, List<Movie>> moviesByGender = movies.stream()
			.collect(Collectors.groupingBy(m -> m.getGenre()));
		
		moviesByGender.forEach((genre, moviesList) -> {
			System.out.print(genre + ": ");
			
			double totalRate = moviesList.stream()
					.map(m -> m.getNote())
					.reduce(0.0, (m1, m2) -> m1 + m2);
			
			double avarageRate = totalRate / moviesList.size();
			
			System.out.printf("%.1f%n", avarageRate);
		});
	}

}
