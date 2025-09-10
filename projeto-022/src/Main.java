import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Insira o valor de x e y: ");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		
		while (x != 0 && y!= 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
			System.out.println("");
			System.out.print("Insira o valor de x e y: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}
}