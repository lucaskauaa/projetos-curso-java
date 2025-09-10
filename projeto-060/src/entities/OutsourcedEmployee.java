package entities;

public final class OutsourcedEmployee extends Employee {
	private Double aditionalCharge;
	
	public OutsourcedEmployee () {
		super();
	}

	public OutsourcedEmployee(String name, Integer workerHours, Double valuePerHour, Double aditionalCharge) {
		super(name, workerHours, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return aditionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}
	
	@Override
	public final Double payment() {
		return super.payment() + aditionalCharge * 1.1;
	}
}
