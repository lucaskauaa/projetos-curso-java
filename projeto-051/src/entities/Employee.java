package entities;

public class Employee {
	
	private final Integer ID;
	private String name;
	private Double salary;
	
	
	public Employee(Integer id, String name, Double salary) {
		ID = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}
	
	public void salaryIncrease(Double porcentage) {
		salary += salary * porcentage / 100.00;
	}

	public String toString() {
		return getID() + ", " + getName() + ", " + String.format("%.2f", getSalary());
	}
	
}
