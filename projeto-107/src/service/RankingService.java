package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import entities.Player;

public class RankingService {
	
	public static List<Player> orderRankingByPoints (List<Player> players) {
		
		return players.stream()
			.sorted((p1, p2) -> p2.getScore().compareTo(p1.getScore()))
			.collect(Collectors.toList());
		
	}
	
	public static Optional<Player> getChampion (List<Player> players) {
		
		return players.stream()
			.limit(1)
			.findFirst();
		
	}

	public static Double getAvarageOfPoints (List<Player> players) {
		
		return players.stream()
				.map(Player::getScore)
				.collect(Collectors.averagingInt(Integer::intValue));
	}
	
	public static List<Player> aboveAvaragePlayer (List<Player> players, Double avarage) {
		
		return players.stream()
			.filter(p -> p.getScore() > avarage)
			.collect(Collectors.toList());
	}
}
