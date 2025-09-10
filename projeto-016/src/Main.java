import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempoConsumidoPeloCliente = sc.nextInt();
		
		double valorAPagar = 50.00;
		
		if (tempoConsumidoPeloCliente > 100) {
			valorAPagar += (tempoConsumidoPeloCliente - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);
		
		sc.close();
	}

}
