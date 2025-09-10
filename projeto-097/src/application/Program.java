package application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//Soma
		Optional<Integer> n = list.stream()
			.reduce((x, y) -> x + y);
		
		System.out.println(n.get());
		
		//Multiplicação
		Optional<Integer> n2 = list.stream()
				.reduce((x, y) -> x * y);
		
		System.out.println(n2.get());
		
		
		//Concatenação
		String str = "Lucas Kauã Neves de Almeida da Costa";
		
		String[] name = str.split(" ");
		
		List<String> names = Arrays.asList(name);
		
		Optional<String> fullName = names.stream()
				.reduce((s1, s2) -> s1 + " " + s2);
		
		System.out.println(fullName.get());
		
		
	}

}
