package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> n1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		Set<Integer> n2 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17));
		
		Set<Integer> n3 = new TreeSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18));
		
		Set<Integer> n4 = new TreeSet<>(n1);
		
		n4.addAll(n2);
		
		n4.removeAll(n3);
		
		for (Integer n : n4) {
			System.out.println(n);
		}
		
	}

}
