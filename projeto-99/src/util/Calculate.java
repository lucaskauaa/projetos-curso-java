package util;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Calculate {

	public static Integer sum(List<Integer> numbers) {

		Integer total = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);

		return total;
	}

	public static Integer avarage(List<Integer> numbers) {

		return sum(numbers) / numbers.size();

	}

	public static Integer max(List<Integer> numbers) {

		Optional<Integer> max = numbers.stream()
				.max((n1, n2) -> n1.compareTo(n2));
		
		return max.get();
	}

	public static Integer min(List<Integer> numbers) {

		Optional<Integer> min = numbers.stream()
				.min((n1, n2) -> n1.compareTo(n2));
		
		return min.get();
	}
	
	public static List<Integer> removeDuplicates(List<Integer> numbers) {
		
		return numbers.stream().distinct().collect(Collectors.toList());
	}
	
	public static List<Integer> getEvenNumbers (List<Integer> numbers) {
		
		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
	}
	
	public static List<Integer> getOddNumbers (List<Integer> numbers) {
		
		return numbers.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
	}
}
