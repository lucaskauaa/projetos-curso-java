package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String file = sc.nextLine();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			List<Employee> employeeList = new ArrayList<>();
			
			String line;
			
			while((line = reader.readLine()) != null) {
				
				String[] fields = line.split(",");
				
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				
				employeeList.add(new Employee(name, email, salary));
			}
			
			System.out.print("Enter salary: ");
			Double salaryBase = sc.nextDouble();
			sc.nextLine();
			
			List<String> emailList = employeeList.stream()
					.filter(e -> e.getSalary() > salaryBase)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emailList.forEach(System.out::println);
			
			double totalSalary = employeeList.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (e1, e2) -> e1 + e2);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", totalSalary);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
