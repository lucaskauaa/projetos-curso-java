package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapeList = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberOfShapes; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char kindOfShape = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Color: (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine());
			
			switch (kindOfShape) {
			case 'r':
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				shapeList.add(new Rectangle(color, width, height));
				break;
			case 'c':
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				shapeList.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for (Shape shape : shapeList) {
			System.out.printf("%.2f%n", shape.area());
		}
		
	}

}
