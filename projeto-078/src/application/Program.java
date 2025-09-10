package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double amount = sc.nextDouble();
		
		System.out.print("Meses: ");
		int months = sc.nextInt();
		
		InterestService interestService = new UsaInterestService(1.0);
		
		System.out.println("Pagamento após " + months + " meses:");
		System.out.printf("%.2f%n", interestService.payment(amount, months));
		
		sc.close();
	}

}
