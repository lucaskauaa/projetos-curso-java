package application;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10);
		
//		Set<Integer> set = list.stream()
//				.collect(Collectors.toCollection(() -> new TreeSet<>()));
//		
//		set.forEach(System.out::println);
		
//		Double avarage = list.stream()
//				.collect(Collectors.averagingInt(n -> n.intValue()));
//		
//		System.out.println(avarage);
		
		
//		Integer sum = list.stream()
//				.collect(Collectors.summingInt(n -> n.intValue()));
//		
//		System.out.println(sum);
		
		
//		IntSummaryStatistics num = list.stream()
//		.collect(Collectors.summarizingInt(x -> x.intValue()));
//
//		System.out.println(num.getCount());
//		System.out.println(num.getAverage());
		
		
//		Long count = list.stream()
//			.collect(Collectors.counting());
//		
//		System.out.println(count);
		
		
//		list.stream()
//			.collect(Collectors.maxBy(Comparator.naturalOrder()))
//			.ifPresent(System.out::println);
		
		
		Map<Integer, String> map = list.stream()
			.collect(Collectors.toMap(x -> x, y -> "Número: " + y));
		
		map.forEach((k, v) -> System.out.println(k + "- " + v));
		
		
	}

}
