package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Movie;
import utils.ReadMoviesData;
import utils.RecommendMovies;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		List<Movie> movies = ReadMoviesData.read(sc);

		int choice;

		do {
			StringBuilder text = new StringBuilder();

			text.append("\nO que você deseja fazer?\n");
			text.append("[1] Listar os top 10 filmes com maior nota.\n");
			text.append("[2] Agrupar filmes por gênero.\n");
			text.append("[3] Recomendar filmes acima de uma nota mínima em determinado gênero.\n");
			text.append("[4] Calcular média de avaliação por gênero.\n");
			text.append("[5] Sair.\n");
			text.append("\nResposta: ");

			System.out.print(text.toString());
			choice = sc.nextInt();
			sc.nextLine();

			System.out.println();

			switch (choice) {
			case 1 -> RecommendMovies.listTop10Movies(movies);
			case 2 -> RecommendMovies.groupMoviesByGenre(movies);
			case 3 -> RecommendMovies.recommendFilmsAboveAMinimumRatingInAGivenGenre(sc, movies);
			case 4 -> RecommendMovies.calculateAverageRatingByGender(movies);
			case 5 -> System.out.println("Programa encerrado.");
			default -> System.out.println("Insira um valor válido!");
			}

		} while (choice != 5);

		sc.close();

	}

}
