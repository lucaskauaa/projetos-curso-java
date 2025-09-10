package entities;

public class Employee {
	private String name;
	private Integer workerHours;
	private Double valuePerHour;
	
	public Employee () {
	}
	
	public Employee(String name, Integer workerHours, Double valuePerHour) {
		this.name = name;
		this.workerHours = workerHours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWorkerHours() {
		return workerHours;
	}

	public void setWorkerHours(Integer workerHours) {
		this.workerHours = workerHours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double payment() {
		return workerHours * valuePerHour;
	}
}
