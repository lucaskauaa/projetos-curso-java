package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		
		list.add(new Circle(2.0));
		list.add(new Rectangle(3.0, 2.0));
		
		double total = totalArea(list);
		
		System.out.printf("%.2f%n", total);
		
		List<Circle> circles = new ArrayList<>();
		
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));
		
		double totalCircleArea = totalArea(circles);
		
		System.out.printf("%.2f%n", totalCircleArea);

	}
	
	public static double totalArea(List<? extends Shape> shapes) {
		double sum = 0.0;
		
		for (Shape shape : shapes) {
			sum += shape.area();
		}
		
		return sum;
	}

}
