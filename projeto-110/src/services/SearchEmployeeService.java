package services;

import java.util.List;
import java.util.Optional;

import entities.Employee;
import util.InputReader;

public class SearchEmployeeService {
	
	public static Optional<? extends Employee> searchEmployeeById(List<? extends Employee> employeeList) {
		
		Long id = InputReader.readLong("Insira o ID do funcionário: ");
		
		return EmployeeAnalyticsService.getEmployeeById(id, employeeList);
		
	}

}
