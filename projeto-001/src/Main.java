import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor01, valor02, resultado;
		
		System.out.print("Insira o primeiro valor: ");
		valor01 = sc.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		valor02 = sc.nextInt();
		
		resultado = valor01 + valor02;
		
		System.out.println("A soma dos dois valores é igual á: " + resultado);
		
		sc.close();
	}
}
