package application;

import java.util.Arrays;
import java.util.List;

import util.Calculate;

public class Program {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(
		            12, 87, 34, 5, 99, 63, 21, 46, 72, 18,
		            54, 90, 7, 38, 44, 66, 29, 11, 83, 4,
		            95, 30, 19, 61, 75, 2, 49, 28, 36, 70,
		            15, 8, 55, 92, 23, 68, 40, 97, 13, 6,
		            79, 25, 53, 31, 84, 46, 12, 99, 21, 38
		        );
		
		Integer total =  Calculate.sum(numbers);
		
		System.out.println("Soma: " + total);
		
		
		Integer avarage = Calculate.avarage(numbers);
		
		System.out.println("Média: " + avarage);
		
		
		Integer max = Calculate.max(numbers);
		System.out.println("Maior número: " + max);
		
		
		Integer min = Calculate.min(numbers);
		System.out.println("Menor número: " + min);
		
		
		List<Integer> nonDuplicateNumbers = Calculate.removeDuplicates(numbers);
		System.out.println("Listas sem repetição de números: " + nonDuplicateNumbers);
		
		
		List<Integer> evenNumbersList = Calculate.getEvenNumbers(numbers);
		System.out.println("Lista com apenas números pares: " + evenNumbersList);
		
		List<Integer> oddNumbersList = Calculate.getOddNumbers(numbers);
		System.out.println("Lista com apenas números ímpares: " + oddNumbersList);
		
	}

}
