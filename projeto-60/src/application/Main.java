package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int amountOfEmployees = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < amountOfEmployees; i++) {
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outSourced = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			if (outSourced == 'y') {
				System.out.print("Additional charge: ");
				Double additonalCharge = sc.nextDouble();
				sc.nextLine();
				
				employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additonalCharge));
				
			} else {
				
				employeeList.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("Payments: ");
		
		for (Employee employee : employeeList) {
			System.out.printf("%s - $ %.2f%n", employee.getName(), employee.payment());
		}
		
		sc.close();
	}

}
