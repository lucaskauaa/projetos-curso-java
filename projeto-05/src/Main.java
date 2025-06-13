import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem01, quantidadeItem01, codigoItem02, quantidadeItem02;
		double valorUnitarioItem01, valorUnitarioItem02, total;
		
		System.out.println("Insira o código, a quantidade e o valor do item 1: ");
		codigoItem01 = sc.nextInt();
		quantidadeItem01 = sc.nextInt();
		valorUnitarioItem01 = sc.nextDouble();
		
		System.out.println("Insira o código, a quantidade e o valor do item 2: ");
		codigoItem02 = sc.nextInt();
		quantidadeItem02 = sc.nextInt();
		valorUnitarioItem02 = sc.nextDouble();
		
		total = valorUnitarioItem01 * quantidadeItem01 + valorUnitarioItem02 * quantidadeItem02;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();
	}

}
