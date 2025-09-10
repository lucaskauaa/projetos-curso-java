import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o salário: ");
		double salario = sc.nextDouble();
		
		double taxaImposto;
		
		if (salario <= 2000.00) {
			taxaImposto = 0.0;
			System.out.println("Insento");
			
		} else if (salario <= 3000.00) {
			taxaImposto = 8.00 / 100.00 * (salario - 2000.00);
			
		} else if (salario <= 4500.00) {
			taxaImposto = (18.00 / 100.00 * (salario - 3000.00)) + (8.00 / 100.00 * 1000.00);
		} else {
			taxaImposto = (28.00 / 100.00 * (salario - 4500.00)) + (18.00 / 100.00 * 1500.00) + (8.00 / 100.00 * 1000.00);
		}
		
		System.out.printf("R$ %.2f", taxaImposto);
		
		sc.close();

	}

}
