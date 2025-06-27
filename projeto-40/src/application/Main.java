package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		
		System.out.print("Insira o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.print("Insira a primeira nota (0-30): ");
		student.grade01 = sc.nextDouble();
		System.out.print("Insira a segunda nota (0-35): ");
		student.grade02 = sc.nextDouble();
		System.out.print("Insira a terceita nota (0-35): ");
		student.grade03 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
