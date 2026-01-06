package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Employee;
import ui.Menu;
import util.InputReader;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Employee> employeeList = new ArrayList<>();
		
		Menu.menuControl(employeeList);
		
		InputReader.SC.close();
	}

}