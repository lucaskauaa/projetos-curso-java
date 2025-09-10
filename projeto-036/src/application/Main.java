package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.print("Insira os 3 lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Insira os 3 lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double trianguloX, trianguloY;
		
		trianguloX = x.area();
		trianguloY = y.area();
		
		System.out.printf("Área triangulo X: %.4f%n", trianguloX);
		System.out.printf("Área triangulo Y: %.4f%n", trianguloY);
		
		verificarTrianguloMaior(trianguloX, trianguloY);
		
		sc.close();

	} 

	public static void verificarTrianguloMaior (double X, double Y) {
		if (X > Y) {
			System.out.println("Triangulo maior: X");
		} else {
			System.out.println("Triangulo maior: Y");
		}
	}
	
}
