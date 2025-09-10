package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
	public static void main (String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		
		List<Object> myObjects = new ArrayList<>();
		
		copy (myInts, myObjects);
		print(myObjects);
		copy (myDoubles, myObjects);
		print(myObjects);
	}
	
	public static void copy (List<? extends Number> numbers, List<? super Number> objects) {
		
		for (Number number : numbers) {
			objects.add(number);
		}
		
	}
	
	public static void print(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}
	
}
