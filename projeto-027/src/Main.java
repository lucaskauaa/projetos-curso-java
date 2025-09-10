import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de casos: ");
		int N = sc.nextInt();
		
		double v1 = 0.0, v2 = 0.0, v3 = 0.0, media = 0.0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Insira os valores: ");
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			
			media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / (2 + 3 + 5);
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
