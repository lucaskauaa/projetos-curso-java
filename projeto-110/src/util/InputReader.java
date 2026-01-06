package util;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Employee;
import entities.enums.Department;
import entities.enums.Gender;
import entities.enums.OutsourcedCompany;

public class InputReader {
	
	public static final Scanner SC = new Scanner(System.in);
	
	public static String readString(String message) {
		System.out.print(message);
		String text = SC.nextLine();
		return text;
	}
	
	public static char readChar (String message) {
		System.out.print(message);
		char charValue = SC.next().charAt(0);
		SC.nextLine();
		
		return charValue;
	}
	
	public static int readInt(String message) {
		
		int intNumber = 0;
		boolean repeat;
		
		do {
			try {
				System.out.print(message);
				intNumber = SC.nextInt();
				SC.nextLine();
				repeat = false;
			} catch(InputMismatchException e) {
				SC.nextLine();
				System.out.println("Insira um valor inteiro válido!");
				repeat = true;
			}
		} while (repeat);
		
		return intNumber;
	}
	
	public static double readDouble(String message) {
		
		double doubleNumber = 0.0;
		boolean repeat;
		
		do {
			try {
				System.out.print(message);
				doubleNumber = SC.nextDouble();
				SC.nextLine();
				repeat = false;
			} catch (InputMismatchException e) {
				SC.nextLine();
				System.out.println("Insira um valor decimal válido!");
				repeat = true;
			}
		} while (repeat);
		
		return doubleNumber;
	}
	
	public static Long readLong (String message) {
		
		Long longNumber = 0L;
		boolean repeat;
		
		do {
			
			try {
				System.out.print(message);
				longNumber = SC.nextLong();
				SC.nextLine();
				
				repeat = false;
				
			} catch (InputMismatchException e) {
				SC.nextLine();
				System.out.println("Insira um número válido!");
				repeat = true;
			}
			
		} while (repeat);
		
		return longNumber;
	}
	
	public static LocalDate readDate(String message) {
		
		boolean repeat;
		
		LocalDate localDate = null;
		
		do {
			try {
				System.out.print(message);
				localDate = LocalDate.parse(SC.nextLine(), Employee.BIRTHDATE_FORMAT);
				repeat = false;
				
			} catch (DateTimeParseException e) {
				System.out.println("Insira uma data num formato válido!");
				repeat = true;
			}
		} while(repeat);
		
		return localDate;
	}

	
	public static Gender readGender (String message) {
		
		boolean repeat;
		Gender gender = null;
		
		do {
			try {
				System.out.print(message);
				gender = Gender.valueOf(SC.nextLine());
				repeat = false;
				
			} catch (IllegalArgumentException e) {
				System.out.println("Insira um gênero válido!");
				
				for (Gender gen : Gender.values()) {
					System.out.println(gen);
				}
				repeat = true;
			}
			
		} while (repeat);
		
		return gender;
	}
	
	public static Department readDepartment (String message) {
		
		boolean repeat;
		Department department = null;
		
		do {
			try {
				System.out.print(message);
				department = Department.valueOf(SC.nextLine());
				repeat = false;
				
			} catch (IllegalArgumentException e) {
				System.out.println("Insira um departamento válido!");
				
				for (Department dep : Department.values()) {
					System.out.println(dep);
				}
				
				repeat = true;
			}
			
		} while (repeat);
		
		return department;
	}
	
	public static OutsourcedCompany readOutsourcedCompany (String message) {
		
		OutsourcedCompany outsourcedCompany = null;
		boolean repeat;
		
		do {
			try {
				System.out.print(message);
				outsourcedCompany = OutsourcedCompany.valueOf(SC.nextLine());
				repeat = false;
				
			} catch(IllegalArgumentException e) {
				System.out.println("Insira uma empresa terceirizada válida!");
				
				for (OutsourcedCompany company : OutsourcedCompany.values()) {
					System.out.println(company);
				}
				
				repeat = true;
				
			}
		} while (repeat);
		
		return outsourcedCompany;
	}
}
