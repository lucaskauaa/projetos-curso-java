package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream()
			.forEach(System.out::println);
		
		
		Integer[] numbers = new Integer[] {1, 2, 3, 4, 5};
		
		Arrays.stream(numbers)
			.forEach(System.out::println);
		
		IntStream.range(1, 99)
			.filter(x -> x % 2 == 0)
			.forEach(System.out::println);
		
		Stream.iterate(1, x -> x * 2)
			.limit(15)
			.forEach(System.out::println);
		
		String path = "C:\\Users\\Lucas Kauã\\Documents\\ti\\curso-java\\text\\stream\\nomes.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			br.lines()
				.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		new Random().ints()
			.filter(n -> n > 0 && n < 1000)
			.limit(10)
			.forEach(System.out::println);
	}

}
