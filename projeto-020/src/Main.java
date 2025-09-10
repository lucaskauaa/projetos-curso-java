import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		int c = 0;
		
		while (numero != 0) {
			numero = sc.nextInt();
			c += numero;
		}
		
		System.out.println(c);
		
		sc.close();

	}

}
