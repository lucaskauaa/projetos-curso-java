package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Insira o nome do funcionário: ");
		employee.nome = sc.nextLine();
		System.out.print("Insira o salário bruto do funcionário: ");
		employee.salarioBruto = sc.nextDouble();
		System.out.print("Insira o imposto sobre salário do funcionário: ");
		employee.imposto = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.printf("Insira a porcentagem de aumento de salário: ");
		double percentage = sc.nextDouble();
		
		employee.aumentarSalario(percentage);
		
		System.out.println(employee);
		
		sc.close();
	}

}
