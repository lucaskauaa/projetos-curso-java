package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService (OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract (Contract contract, Integer months) {
		
		
		for (int i = 1; i <= months; i ++) {
			
			LocalDate date = contract.getDate().plusMonths(i);
			
			double installmentValue = contract.getTotalValue() / months; 
			
			installmentValue += paymentService.interest(installmentValue, i);
			
			installmentValue += paymentService.paymentFee(installmentValue);
			
			contract.addInstallment(new Installment(date, installmentValue));
			
		}
		
	}
}
