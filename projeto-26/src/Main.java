import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int in = 0, out = 0, X = 0;
		
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
