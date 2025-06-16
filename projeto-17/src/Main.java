import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		String diaDaSemana = "";
		
		switch (numero) {
		case 1: 
			diaDaSemana = "Domingo";
			break;
		case 2: 
			diaDaSemana = "Segunda";
			break;
		case 3: 
			diaDaSemana = "Terça";
			break;
		case 4: 
			diaDaSemana = "Quarta";
			break;
		case 5: 
			diaDaSemana = "Quinta";
			break;
		case 6: 
			diaDaSemana = "Sexta";
			break;
		case 7: 
			diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Valor inválido";
			break;
		}
		
		System.out.println(diaDaSemana);
		
		sc.close();
	}

}
