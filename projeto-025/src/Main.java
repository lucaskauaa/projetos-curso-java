import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número entre 1 e 1000: ");
		int X = sc.nextInt();
		
		for (int i = X; i <= 1000; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
