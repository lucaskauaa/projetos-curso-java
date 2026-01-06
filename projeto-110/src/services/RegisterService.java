package services;

import java.time.LocalDate;
import java.util.List;

import entities.Address;
import entities.Contacts;
import entities.Employee;
import entities.OutsourcedEmployee;
import entities.PermanentEmployee;
import entities.enums.Department;
import entities.enums.Gender;
import entities.enums.OutsourcedCompany;
import util.InputReader;
import util.Reader;

public class RegisterService {
	
	public static void registerEmployee(List<Employee> employeeList) {
		
		char choice;
		
		do {
			System.out.println("\n===================================");
			System.out.println("Cadastrar funcionário manualmente:");
			
			Long id = setId(employeeList);
			
			String firstName = InputReader.readString("\nNome: ");
			
			String lastName = InputReader.readString("Sobrenome: ");
			
			LocalDate birthDate = InputReader.readDate("Data nascimento (dd/mm/aaaa): ");
			
			Gender gender = InputReader.readGender("Gênero [M][F]: ");
			
			String state = InputReader.readString("Estado: ");
			
			String city = InputReader.readString("Cidade: ");
			
			Address address = new Address(state, city);
		
			String email = InputReader.readString("Email: ");
			
			String phoneNumber = InputReader.readString("Telefone: ");
			
			Contacts contacts = new Contacts(email, phoneNumber);
			
			Department department = InputReader.readDepartment("Departamento: ");
			
			double salary = InputReader.readDouble("Salário: ");
			
			char isOutsourcedEmployee = InputReader.readChar("Funcionário Terceirizado? [s][n] ");
			
			Employee employee;
			
			if (isOutsourcedEmployee == 's') {
				OutsourcedCompany company = InputReader.readOutsourcedCompany("Nome da terceirizada: ");
				
				employee = new OutsourcedEmployee(id, firstName, lastName, birthDate, gender, address, contacts, department, salary, company);
				
			} else {
				employee = new PermanentEmployee(id, firstName, lastName, birthDate, gender, address, contacts, department, salary);
			}
			
			employeeList.add(employee);
			
			choice = InputReader.readChar("\nCadastrar novamente? [s][n]: ");
			
		} while(choice == 's');
	}
	
	public static void registerEmployeeByFile (List<Employee> employeeList) {
		
		String filePath = InputReader.readString("\nInsira o caminho da arquivo: ");
		
		List<String> fileLines = Reader.readFile(filePath);
		
		if (fileLines.isEmpty()) {
			return;
		} 
		
		for (String line : fileLines) {
			String[] fields = line.split(",");
			
			Long id = setId(employeeList);
			
			String firstName = fields[0];
			
			String lastName = fields[1];
			
			LocalDate birthDate = LocalDate.parse(fields[2], Employee.BIRTHDATE_FORMAT);
			
			Gender gender = Gender.valueOf(fields[3]);
			
			String state = fields[4];
			
			String city = fields[5];
			
			Address address = new Address(state, city);
		
			String email = fields[6];
			
			String phoneNumber = fields[7];
			
			Contacts contacts = new Contacts(email, phoneNumber);
			
			Department department = Department.valueOf(fields[8]);
			
			double salary = Double.parseDouble(fields[9]);
			
			char isOutsourcedEmployee = fields[10].charAt(0);
			
			Employee employee;
			
			if (isOutsourcedEmployee == 's') {
				OutsourcedCompany company = OutsourcedCompany.valueOf(fields[11]);
				
				employee = new OutsourcedEmployee(id, firstName, lastName, birthDate, gender, address, contacts, department, salary, company);
				
			} else {
				employee = new PermanentEmployee(id, firstName, lastName, birthDate, gender, address, contacts, department, salary);
			}
			
			employeeList.add(employee);
		}
		
		System.out.println("Leitura completa!");
	}
	
	private static Long setId (List<Employee> employeeList) {
		
		if (employeeList.isEmpty()) {
			return 1L;
		} else {
			return employeeList.getLast().getId() + 1L;
		}
	}

}
