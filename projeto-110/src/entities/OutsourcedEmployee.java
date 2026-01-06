package entities;

import java.time.LocalDate;

import entities.enums.Department;
import entities.enums.Gender;
import entities.enums.OutsourcedCompany;

public class OutsourcedEmployee extends Employee {
	OutsourcedCompany company;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(Long id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address,
			Contacts contacts, Department department, Double monthSalary, OutsourcedCompany company) {
		super(id, firstName, lastName, birthDate, gender, address, contacts, department, monthSalary);
		this.company = company;
	}

	public OutsourcedCompany getCompany() {
		return company;
	}

	public void setCompany(OutsourcedCompany company) {
		this.company = company;
	}

	public double annualBonus() {
		return getYearSalary() * 0.07;
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
		text.append("\nEmpresa Terceirizada: " + company);
		text.append("\nBônus Anual: R$" + String.format("%.2f", annualBonus()));
		
		return text.toString();			
	}
}
