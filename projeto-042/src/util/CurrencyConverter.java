package util;

public class CurrencyConverter {
	public static final double IOF = 6.0;
	
	public static double convertToDollar (double dollarPrice, double dollarQuantity) {
		double totalValue = dollarPrice * dollarQuantity;
		
		totalValue += totalValue * (IOF / 100.00);
		
		return totalValue;
	}
	
}
