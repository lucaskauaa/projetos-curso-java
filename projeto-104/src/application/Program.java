package application;

import java.util.Optional;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		String text = "abc";
		
		Optional<Integer> number = stringToNumber(text);
		
		System.out.println(number.orElseGet(() -> 5));
		
		Stream.of(1, 2, 3, 4, 5)
			.findFirst()
			.ifPresent(x -> System.out.println(x));
		
	}
	
	public static Optional<Integer> stringToNumber (String text) {
		
		try {
			Integer number = Integer.valueOf(text);
			
			return Optional.of(number);
			
		} catch(NumberFormatException e) {
			return Optional.empty();
		}
		
	}

}
