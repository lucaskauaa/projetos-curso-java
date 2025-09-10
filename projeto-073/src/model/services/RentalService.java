package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double valuePerHour;
	private Double valuePerDay;
	private TaxService taxService;

	public RentalService(Double valuePerHour, Double valuePerDay, TaxService taxService) {
		this.valuePerHour = valuePerHour;
		this.valuePerDay = valuePerDay;
		this.taxService = taxService;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValuePerDay() {
		return valuePerDay;
	}

	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
	
	public TaxService getTaxService() {
		return taxService;
	}

	public void setBrazilianTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		
		double hours = minutes / 60.0;
		
		double basicPayment;
		
		if (hours <= 12.0) {
			basicPayment = valuePerHour * Math.ceil(hours);
		} else {
			basicPayment = valuePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
}
