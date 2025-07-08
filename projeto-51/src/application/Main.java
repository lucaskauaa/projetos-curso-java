package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> employeeLog = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("Employee #" + (i + 1));
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(employeeLog, id)) {
				System.out.println("");
				System.out.println("ID alredy taken!, try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			
			employeeLog.add(employee);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		
		Employee employeeId = employeeLog.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		
		if (employeeId != null) {
			System.out.print("Enter the porcentage: ");
			Double porcentage = sc.nextDouble();
			employeeId.salaryIncrease(porcentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("");
		System.out.println("List of employees:");
		
		for (Employee employee : employeeLog) {
			System.out.println(employee);
		}
		
		sc.close();
	}

	public static Boolean hasId (List<Employee> list, Integer id) {
		Employee employee = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		
		return !(employee == null);
	}
}
