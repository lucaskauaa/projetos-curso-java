import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double horasTrabalhadas, valorPorHora, salarioFuncionario;
		
		System.out.println("Insira o número do funcionário, a quantidade de horas trabalhadas e o valor que ele recebe por hora: ");
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorPorHora = sc.nextDouble();
		
		salarioFuncionario = valorPorHora * horasTrabalhadas;
		
		System.out.println("Number: " + numeroFuncionario);
		System.out.printf("Salary: U$ %.2f", salarioFuncionario);
		
		sc.close();
	}

}
