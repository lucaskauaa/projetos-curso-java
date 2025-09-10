package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), format);
		
		System.out.print("Valor do contrato: ");
		double contractAmount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractAmount);
		
		System.out.print("Entre com o número de parcelas: ");
		int installmentNumber = sc.nextInt();
		sc.nextLine();
		
		ContractService contractService = new ContractService(new PayPalService());
		
		contractService.processContract(contract, installmentNumber);
		
		System.out.println("Parcelas: ");
		
		for (Installment installment : contract.getInstallmentList()) {
			System.out.println(installment);
		}
		
		sc.close();

	}

}
