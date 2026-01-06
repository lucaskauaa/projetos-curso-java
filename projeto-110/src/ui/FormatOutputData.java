package ui;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import entities.Employee;
import services.EmployeeAnalyticsService;
import services.SearchEmployeeService;

public class FormatOutputData {
	
	private static void displayList (List<?> list, String errorMessage) {
		if (list.isEmpty()) {
			System.out.println(errorMessage);
		} else {
			list.forEach(System.out::println);
		}
	}
	
	private static <T, E> void displayMap (Map<T, List<E>> map, String errorMessage) {
		
		if (map.isEmpty()) {
			System.out.println(errorMessage);
		} else {
			map.forEach((k, v) -> {
				System.out.println("\n========== " + k + " ==========");
				v.forEach(System.out::println);
			});
		}
	}
	
	private static <T, E> void displayMap (Map<T, E> map, String errorMessage, BiConsumer<T, E> displayFormat) {
		
		if (map.isEmpty()) {
			System.out.println(errorMessage);
		} else {
			map.forEach(displayFormat);
		}
	}
	
	private static void displaySalary (double salary, List<? extends Employee> employeeList, String errorMessage, String successMessage) {
		
		if (employeeList.isEmpty() || salary == 0.0) {
			System.out.println(errorMessage);
		} else {
			System.out.printf("%sR$%.2f%n", successMessage, salary);
		}
		
	}
	
	public static void displayEmployeeById (List<? extends Employee> employeeList) {
		
		SearchEmployeeService.searchEmployeeById(employeeList)
			.ifPresentOrElse(
					System.out::println,
					() -> System.out.println("\nNenhum funcionário com esse ID foi encontrado.\n")
					);
	}
	
	public static void displayRegisteredEmployees (List<? extends Employee> employeeList) {
		
		displayList(employeeList, "\nNenhum funcionário foi cadastrado!\n");
		
	}
	
	public static void displayPermanentEmployees (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Efetivados");
		
		displayList(
				EmployeeAnalyticsService.getPermanentEmployee(employeeList),
				"\nNenhum funcionário efetivado cadastrado!\n"
				);
	}
	
	public static void displayOutsourcedEmployees (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Terceirizados");
		
		displayList(
				EmployeeAnalyticsService.getOutsourcedEmployee(employeeList), 
				"\nNenhum funcionário terceirizado cadastrado!\n"
				);
	}
	
	public static void displayEmployeeByDepartment (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Por Departamento");
		
		displayMap(
				EmployeeAnalyticsService.getEmployeeByDepartment(employeeList),
				"\nNenhum funcionário cadastrado!\n"
				);
	}
	
	public static void displayEmployeeByOutsourcedCompany (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Por Empresa Terceirizada");
		
		displayMap(
				EmployeeAnalyticsService.getEmployeeByOutsourcedCompany(employeeList),
				"\nNenhum funcionário terceirizado cadastrado!\n"
				);
	}
	
	public static void displayHighestPaidEmployees (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Com Maiores Salários");
		
		displayList(
				EmployeeAnalyticsService.getHighestPaidEmployees(employeeList),
				"\nNenhum funcionário cadastrado!\n"
				);
	}
	
	public static void displayAvarageSalaryFromPermanentEmployee (List<? extends Employee> employeeList) {
		
		displaySalary(
				 EmployeeAnalyticsService.getAvarageSalaryFromPermanentEmployee(employeeList),
				 employeeList,
				 "\nNenhum funcionário efetivado cadastrado!\n",
				"\nMédia salarial dos funcionários efetivados: "
				);
		
	}
	
	public static void displayAvarageSalaryFromOutsourcedEmployee (List<? extends Employee> employeeList) {
		
		displaySalary(
				EmployeeAnalyticsService.getAvarageSalaryFromOutsourcedEmployee(employeeList),
				employeeList,
				"\nNenhum funcionário terceirizado cadastrado!\n",
				"\nMédia salarial dos funcionários terceirizados: "
				);
	}
	
	public static void displayAvarageSalaryByDepartment (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Salário médio por departamento");
		
		displayMap(
				EmployeeAnalyticsService.getAverageSalaryByDepartment(employeeList),
				"\nNenhum funcionário cadastrado!\n",
				(k, v) -> {
					System.out.println("\nDepartamento: " + k);
					System.out.println("Média Salarial: R$ " + v);
				}
				);
	}
	
	public static void displayOlderEmployee (List<? extends Employee> employeeList) {
		
		System.out.println("=====================================");
		System.out.println("Funcionários Mais Velhos");
		
		displayList(
				EmployeeAnalyticsService.getOlderEmployee(employeeList),
				"\nNenhum funcionário cadastrado!\n"
				);
	}
}
