import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int n1 = 0, n2 = 0;
		
		
		for (int i = 0; i < N; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				System.out.println((double) n1 / n2);
			}
		}
		
		sc.close();
	}

}
