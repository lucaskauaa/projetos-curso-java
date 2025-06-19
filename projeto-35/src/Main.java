import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2 ,n3, maior;
		
		System.out.println("Insira três números inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		maior = max(n1, n2, n3);
		
		showResult(maior);
		
		
		sc.close();
	}

	public static int max (int a, int b, int c) {
		
		int maior;
		
		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else  {
			maior = c;
		}
		
		return maior;
	}
	
	public static void showResult (int maior) {
		System.out.println("Maior número: " + maior);
	}
}
