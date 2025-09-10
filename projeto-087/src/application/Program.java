package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> students = new HashSet<>();
		
		String[] courses = new String[] {"A", "B", "C"};
		
		for (String c : courses) {
			
			System.out.print("How many students for course " + c + "? ");
			int amoutCourses = sc.nextInt();
			
			for (int i = 0; i < amoutCourses; i++) {
				
				students.add(new Student(sc.nextInt()));
				
			}
			
		}
		
		System.out.println("Total students: " + students.size());

		sc.close();
	}

}
