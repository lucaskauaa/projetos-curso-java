package entities;

public class Rectangle {
	public double largura;
	public double altura;
	
	public double area () {
		return largura * altura;
	}
	
	public double perimetro () {
		return 2.0 * (largura + altura);
	}
	
	public double diagonal () {
			return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
}
