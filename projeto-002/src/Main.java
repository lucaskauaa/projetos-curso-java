import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, pi, area;
		
		System.out.print("Insira o valor do raio: ");
		raio = sc.nextDouble();
		
		pi = 3.14159;
		
		area = pi * Math.pow(raio, 2.0);	
	
		System.out.printf("Valor da área: %.4f", area);
		
		sc.close();
	}
}
