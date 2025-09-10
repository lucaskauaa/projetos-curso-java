import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		
		System.out.println("Insira 3 valores decimais: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTrianguloRetangulo, areaCirculo, pi, areaTrapezio, areaQuadrado, areaRetangulo;
		
		areaTrianguloRetangulo = A * C / 2.0;
		pi = 3.14159;
		areaCirculo = pi * Math.pow(C, 2.0);
		areaTrapezio = (A + B) * C / 2.0;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
