package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int amountOfContracts = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < amountOfContracts; i++) {
			
			System.out.println("Enter contract " + (i + 1) + "# data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			String inputDate = sc.nextLine();
			LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();	
			sc.nextLine();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			
			HourContract hourContract = new HourContract(date, valuePerHour, hours);
			
			worker.addContract(hourContract);
			
		}
		
		System.out.println("Enter year and month to calculate income:");
		System.out.print("Year: ");
		Integer year = sc.nextInt();
		
		System.out.print("Month: ");
		Integer month = sc.nextInt();
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %d/%d: %.2f",  month, year, worker.income(year, month));
	}

}
