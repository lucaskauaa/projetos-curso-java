import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;
		
		System.out.println("Insira quatro valores inteiros: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.printf("%d %d %d %d %n", A, B, C, D);
		
		System.out.println("Diferença: " + diferenca);
		
		sc.close();
	}
}
