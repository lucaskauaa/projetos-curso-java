package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape circle = new Circle(Color.BLACK, 2.0);
		
		AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + circle.getColor());
		System.out.printf("Circle area: %.2f%n", circle.area());
		
		System.out.println("Rectangle color: " + rectangle.getColor());
		System.out.printf("Rectangle area: %.2f%n", rectangle.area());

	}

}
