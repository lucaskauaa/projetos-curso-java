package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		list.forEach(System.out::println);
		
		list.removeIf(x -> x % 2 == 0);
		
		list.forEach(System.out::println);
		
		list.replaceAll(x -> x * 2);

		list.forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(0, "Lucas");
		map.put(1, "Kauã");
		map.put(2, "Neves");
		map.put(3, "Almeida");
		map.put(4, "Costa");
		
		map.forEach((k, v) -> System.out.println(k + "- " + v));
		
		map.compute(0, (k, v) -> "Levi");
		
		System.out.println(map.get(0));
		
		map.merge(4, ".", (v1, v2) -> v1 + v2);
		
		System.out.println(map.get(4));
		
		
		map.replaceAll((k, v) -> v + "!");
		
		map.forEach((k, v) -> System.out.println(k + "- " + v));
	}

}
