package util;

public class Calculator {
	
	public static final double PI = 3.1416;
	
	public static double circumference (double radius) {
		return 2.0 * pi() * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * pi() * Math.pow(radius, 3.0) / 3.0;
	}
	
	public static double pi () {
		return 3.1416;
	}
}
