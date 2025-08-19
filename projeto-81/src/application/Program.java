package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> elements = Arrays.asList(5, 2, 10);
		
		printList(elements);

	}
	
	public static void printList(List<?> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}

}
