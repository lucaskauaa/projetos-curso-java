package ui;

import java.util.List;

import entities.Employee;
import services.RegisterService;
import util.InputReader;

public class RegisterMenu {
	
	public static void registerMenuControl (List<Employee> employeeList) {
		
		StringBuilder text = new StringBuilder();
		
		text.append("\n======================================");
		text.append("\nCADASTRO DE FUNCIONÁRIOS");
		text.append("\n[1] Cadastrar funcionário manualmente");
		text.append("\n[2] Ler funcionários de um arquivo");
		text.append("\n[0] Voltar para menu inicial");
		text.append("\nEscolha uma opção: ");
		
		int choice;
		
		do {
			choice = InputReader.readInt(text.toString());
			
			switch (choice) {
			case 1 -> RegisterService.registerEmployee(employeeList);
			case 2 -> RegisterService.registerEmployeeByFile(employeeList);
			case 0 -> System.out.println("Voltando...");
			}
			
		} while (choice != 0);
		
	}

}
