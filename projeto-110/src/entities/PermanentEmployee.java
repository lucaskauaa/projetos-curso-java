package entities;

import java.time.LocalDate;

import entities.enums.Department;
import entities.enums.Gender;

public class PermanentEmployee extends Employee {

	public PermanentEmployee() {
		super();
	}
	
	public PermanentEmployee(Long id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address,
			Contacts contacts, Department department, Double monthSalary) {
		super(id, firstName, lastName, birthDate, gender, address, contacts, department, monthSalary);
	}

	public double annualBonus() {
		return getYearSalary() * 0.15;
	}
	
	@Override
	public String toString() {
		
		StringBuilder text = new StringBuilder();
		
		text.append("\nId: " + id);
		text.append("\nNome: " + firstName + " " + lastName);
		text.append("\nData nascimento: " + birthDate.format(Employee.BIRTHDATE_FORMAT));
		text.append("\nGênero: " + gender);
		text.append("\nEstado: " + address.getState());
		text.append("\nCidade: " + address.getCity());
		text.append("\nEmail: " + contacts.getEmail());
		text.append("\nTelefone: " + contacts.getPhoneNumber());
		text.append("\nDepartamento: " + department);
		text.append("\nSalário Mensal: R$" + String.format("%.2f", monthSalary));
		text.append("\nBônus Anual: R$" + String.format("%.2f", annualBonus()));
		
		return text.toString();			
	}
	
}