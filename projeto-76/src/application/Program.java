package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("3050");
		
		c.processDoc("My doc");
		
		c.print("My doc");
		
		System.out.println("Scan result: " + c.scan());

	}

}
