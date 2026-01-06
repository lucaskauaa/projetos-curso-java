package ui;

import java.util.List;

import entities.Employee;
import util.InputReader;

public class Menu {
	
	public static  void menuControl (List<Employee> employeeList) {
		StringBuilder text = new StringBuilder();
		
		text.append("==================== MENU ====================");
		text.append("\n[1] Cadastrar funcionários");
		text.append("\n[2] Pegar funcionário por ID");
		text.append("\n[3] Exibir funcionários cadastrados");
		text.append("\n[4] Exibir funcionários efetivados");
		text.append("\n[5] Exibir funcionários terceirizados");
		text.append("\n[6] Exibir funcionários por departamento");
		text.append("\n[7] Exibir funcionários por terceirizada");
		text.append("\n[8] Exibir funcionários com maior salário");
		text.append("\n[9} Exibir média salarial dos funcionários efetivados");
		text.append("\n[10] Exibir média salarial dos funcionários terceirizados");
		text.append("\n[11] Exibir média salarial por departamento");
		text.append("\n[12] Exibir funcionários mais velhos");
		text.append("\n[0] Encerrar programa");
		text.append("\nEscolha uma opção: ");
		
		int choice;
		
		do {
			choice = InputReader.readInt(text.toString());
			
			switch (choice) {
			case 1 -> RegisterMenu.registerMenuControl(employeeList);
			case 2 -> FormatOutputData.displayEmployeeById(employeeList);
			case 3 -> FormatOutputData.displayRegisteredEmployees(employeeList);
			case 4 -> FormatOutputData.displayPermanentEmployees(employeeList);
			case 5 -> FormatOutputData.displayOutsourcedEmployees(employeeList);
			case 6 -> FormatOutputData.displayEmployeeByDepartment(employeeList);
			case 7 -> FormatOutputData.displayEmployeeByOutsourcedCompany(employeeList);
			case 8 -> FormatOutputData.displayHighestPaidEmployees(employeeList);
			case 9 -> FormatOutputData.displayAvarageSalaryFromPermanentEmployee(employeeList);
			case 10 -> FormatOutputData.displayAvarageSalaryFromOutsourcedEmployee(employeeList);
			case 11 -> FormatOutputData.displayAvarageSalaryByDepartment(employeeList);
			case 12 -> FormatOutputData.displayOlderEmployee(employeeList);
			case 0 -> System.out.println("Programa encerrado.");
			}
			
		} while (choice != 0);
	}

}
