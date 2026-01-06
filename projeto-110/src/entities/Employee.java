package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import entities.enums.Department;
import entities.enums.Gender;

public abstract class Employee implements Comparable<Employee> {
	
	protected Long id;
	protected String firstName;
	protected String lastName;
	protected LocalDate birthDate;
	protected Gender gender;
	protected Address address;
	protected Contacts contacts;
	protected Department department;
	protected Double monthSalary;
	
	public static final DateTimeFormatter BIRTHDATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Employee() {
	}

	public Employee(Long id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address,
			Contacts contacts, Department department, Double monthSalary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.contacts = contacts;
		this.department = department;
		this.monthSalary = monthSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(Double monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

	public double getYearSalary () {
		return monthSalary * 12;
	}
	
	public int compareTo(Employee next) {
		return this.monthSalary.compareTo(next.monthSalary);
	}
	
	public abstract double annualBonus();
	
}
