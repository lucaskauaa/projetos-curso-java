package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilianTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), format);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), format);
		
		CarRental carRental = new CarRental(startDate, finishDate, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();
		sc.nextLine();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilianTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA:");
		System.out.printf("Pagamento básico: %.2f%n", carRental.getInvoice().getBasicPayment());
		System.out.printf("Imposto: %.2f%n", carRental.getInvoice().getTax());
		
		System.out.printf("Pagamento total: %.2f%n", carRental.getInvoice().getTotalPayment());
		
		sc.close();

	}

}
