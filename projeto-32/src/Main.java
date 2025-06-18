import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char repetir;
			
		do {
			System.out.print("Digite a temperatura em celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Temperatura em fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir s/n? ");
			repetir = sc.next().charAt(0);
			
			while (repetir != 's' && repetir != 'n') {
				System.out.println("Valor inválido!");
				System.out.println("Insira [s] ou [n]");
				repetir = sc.next().charAt(0);
			}
		} while (repetir != 'n');
		
		sc.close();
	}

}
