package entities;

public class Student {
	public String name;
	public double grade01;
	public double grade02;
	public double grade03;
	
	public double finalGrade() {
		return grade01 + grade02 + grade03;
	}
	
	public String status() {
		if (finalGrade() >= 60.0) {
			return "Pass";
		} else {
			return "Failed";
		}
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.00 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		
		if (missingPoints() > 0.0) {
			return "Final grade = " + String.format("%.2f%n", finalGrade()) + status() + "\nMissing " + String.format("%.2f", missingPoints()) + 			" points";
		} else {
			return "Final grade = " + String.format("%.2f%n", finalGrade()) + status();
		}
	}
}
