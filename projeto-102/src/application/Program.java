package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Sale;
import utils.ReadSalesData;
import utils.SalesDashboard;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Sale> sales = ReadSalesData.read(sc);
		
		System.out.println("\nVendas: ");
		
		sales.stream()
			.forEach(System.out::println);
		
		int choice;
		
		do {
			StringBuilder text = new StringBuilder();
			
			text.append("\nO que você deseja fazer?\n");
			text.append("[1] Faturamento total por cliente.\n");
			text.append("[2] Produto mais vendido.\n");
			text.append("[3] Agrupar vendas por mês/ano.\n");
			text.append("[4] Calcular ticket médio.\n");
			text.append("[5] Sair.\n");
			text.append("Resposta: ");
			
			System.out.print(text.toString());
			choice = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(choice) {
			case 1 -> SalesDashboard.totalRevenuePerCustomer(sales);
			case 2 -> SalesDashboard.bestSellingProduct(sales);
			case 3 -> SalesDashboard.groupSalesByDate(sales);
			case 4 -> SalesDashboard.calculateAvarageTicket(sales);
			case 5 -> System.out.println("Programa encerrado.");
			default -> System.out.println("Insira um valor válido!");
			}
			
		} while (choice != 5);
		
		sc.close();

	}

}
