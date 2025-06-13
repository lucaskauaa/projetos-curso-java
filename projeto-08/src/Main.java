import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		
		
		sc.close();

	}

}
