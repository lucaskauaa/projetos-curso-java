package services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import entities.Employee;
import entities.OutsourcedEmployee;
import entities.PermanentEmployee;
import entities.enums.Department;
import entities.enums.OutsourcedCompany;

public class EmployeeAnalyticsService {
	
	public static Optional<? extends Employee> getEmployeeById (Long id, List<? extends Employee> employeeList) {
		
		return employeeList.stream()
			.filter(e -> e.getId().equals(id))
			.findFirst();
	}
	
	public static List<? extends Employee> getPermanentEmployee (List<? extends Employee> employeeList) {
		
		return employeeList.stream()
			.filter(e -> e instanceof PermanentEmployee)
			.collect(Collectors.toList());
	}
	
	public static List<? extends Employee> getOutsourcedEmployee (List<? extends Employee> employeeList) {
		
		return employeeList.stream()
				.filter(e -> e instanceof OutsourcedEmployee)
				.collect(Collectors.toList());
	}
	
	public static Map<Department, List<Employee>> getEmployeeByDepartment (List<? extends Employee> employeeList) {
		
		return employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
	}
	
	public static Map<OutsourcedCompany, List<OutsourcedEmployee>> getEmployeeByOutsourcedCompany (List<? extends Employee> employeeList) {
		
		List<OutsourcedEmployee> outsourcedEmployeeList = new ArrayList<>();
		
		employeeList.stream()
			.filter(e -> e instanceof OutsourcedEmployee)
			.forEach(e -> outsourcedEmployeeList.add((OutsourcedEmployee) e));
		
		return outsourcedEmployeeList.stream()
				.collect(Collectors.groupingBy(OutsourcedEmployee::getCompany));
	}
	
	public static List<? extends Employee> getHighestPaidEmployees (List<? extends Employee> employeeList) {
		
		return employeeList.stream()
			.sorted(Comparator.comparing(Employee::getMonthSalary).reversed())
			.limit(5)
			.collect(Collectors.toList());
	}
	
	public static double getAvarageSalaryFromPermanentEmployee (List<? extends Employee> employeeList) {
		
		return employeeList
				.stream()
				.filter(e -> e instanceof PermanentEmployee)
				.collect(Collectors.averagingDouble(Employee::getMonthSalary));
	}
	
	public static double getAvarageSalaryFromOutsourcedEmployee (List<? extends Employee> employeeList) {
		
		return employeeList
				.stream()
				.filter(e -> e instanceof OutsourcedEmployee)
				.collect(Collectors.averagingDouble(Employee::getMonthSalary));
	}
	
	public static Map<Department, Double> getAverageSalaryByDepartment (List<? extends Employee> employeeList) {
		
		return employeeList
				.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.averagingDouble(Employee::getMonthSalary)
				))
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(
						Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new)
				);
	}
	
	public static List<? extends Employee> getOlderEmployee (List<? extends Employee> employeeList) {
		
		return employeeList
				.stream()
				.sorted(Comparator.comparing(Employee::getBirthDate))
				.limit(5)
				.collect(Collectors.toList());
	}
}
