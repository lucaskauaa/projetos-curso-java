package application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import entities.Player;
import service.RankingService;

public class Program {

	public static void main(String[] args) {
		
		List<Player> players = Arrays.asList(
				
				new Player("Lucas", 85),
				new Player("Savyo", 73),
				new Player("Jônatas", 79),
				new Player("Igor", 77),
				new Player("Kelvin", 68),
				new Player("João", 83)
				);

		System.out.println("Ranking por pontos:");
		
		List<Player> playersRanking = RankingService.orderRankingByPoints(players);
		
		playersRanking.forEach(System.out::println);
		
		
		System.out.println("\nCampeão: ");
		Optional<Player> champion = RankingService.getChampion(playersRanking);
		
		champion.ifPresent(System.out::println);
		
		
		System.out.print("\nMédia de pontos: ");
		Double avarage = RankingService.getAvarageOfPoints(players);
		
		System.out.printf("%.0f%n", avarage);
		
		
		System.out.println("\nJogadores acima da média: ");
		List<Player> playersAboveAvarage = RankingService.aboveAvaragePlayer(players, avarage);
		
		playersAboveAvarage.forEach(System.out::println);
	}

}
