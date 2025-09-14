package application;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import entities.Customer;
import util.Calculate;

public class Program {

	public static void main(String[] args) {
		
		List<Customer> customerList = Arrays.asList(
				
				new Customer("Lucas", 22),
				new Customer("Savyo", 22),
				new Customer("Jonatas", 18)
				);
				
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream()
			.forEach(x -> System.out.println(x));
		
		list.stream()
			.forEach(System.out::println);
		
		list.stream()
			.map(Calculate::multiplyByTwo)
			.forEach(System.out::println);
		
		
		
		Set<Integer> nums = list.stream()
			.collect(Collectors.toCollection(TreeSet::new));
	
		
		
		list.stream()
			.map(Integer::doubleValue)
			.forEach(System.out::println);
	
		
		customerList.stream()
			.map(Customer::getAge)
			.forEach(System.out::println);
		
		
		List<Integer> newList = Arrays.asList(1, 5, 6, 2, 9, 7, 3, 5, 4, 4, 10);
		
		newList.stream()
			.sorted(Integer::compareTo)
			.forEach(System.out::println);
	}

}
