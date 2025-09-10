import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor, desconto;
		
		valor = sc.nextDouble();
		
		desconto = (valor < 20.0) ? valor * 0.1 : valor * 0.05;
		
		System.out.printf("Desconto: R$ %.2f", desconto);
		
		sc.close();
	}

}