package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.print("Insira a largura do retângulo: ");
		rectangle.largura = sc.nextDouble();
		System.out.print("Insira a altura do retângulo: ");
		rectangle.altura = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", rectangle.area());
		System.out.printf("Perímetro: %.2f%n", rectangle.perimetro());
		System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
