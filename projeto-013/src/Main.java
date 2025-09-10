import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número qualquer: ");
		double numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25.00) {
			System.out.println("Intervalo [0,25]");
			
		} else if (numero >= 0 && numero <= 50.00) {
			System.out.println("Intervalo [25,50]");
			
		} else if (numero >= 0 && numero <= 75.00) {
			System.out.println("Intervalo [50,75]");
			
		} else if (numero >= 0 && numero <= 100.00) {
			System.out.println("Intervalo [75,100]");
			
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}