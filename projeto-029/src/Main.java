import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fatorial = N;
		
		if (N == 0) {
			fatorial = 1;
		} else {
			for (int i = 1; i < N; i++) {
				fatorial *= N - i;
			}
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}
}