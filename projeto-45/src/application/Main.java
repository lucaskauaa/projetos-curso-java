package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] height = new double[N];
		
		for (int i = 0; i < N; i++) {
			height[i] = sc.nextDouble();
		}
		
		double total = 0.0;
		
		for (int i = 0; i < height.length; i++) {
			total += height[i];
		}
		
		double avarageHeight = total / (double) N;
		
		System.out.printf("AVARAGE HEIGHT = %.2f", avarageHeight);
		
		sc.close();
	}

}
