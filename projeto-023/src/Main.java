import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipoCombustivel, alcool, gasolina, diesel;
		
		tipoCombustivel = 1;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		System.out.println("Insira o tipo de combustível: ");
		System.out.println("[1] Álcool");
		System.out.println("[2] Gasolina");
		System.out.println("[3] Diesel");
		System.out.println("[4] Encerrar");
		
		while (tipoCombustivel != 0 && tipoCombustivel != 4) {
			
			tipoCombustivel = sc.nextInt();
			
			switch (tipoCombustivel) {
				case 1: 
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
				case 4:
					break;
				default:
					System.out.println("Insira um código válido!");
					break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}