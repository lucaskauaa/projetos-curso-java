import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigoItem, quantidadeItem;
		double total = 0;
		
		System.out.println("CÓDIGO // ESPECIFICAÇÃO // PREÇO");
		System.out.println("1	Cachorro Quente   R$ 4.00");
		System.out.println("2	X-Salada          R$ 4.50");
		System.out.println("3	X-Bacon           R$ 5.00");
		System.out.println("4	Torrada Simples   R$ 2.00");
		System.out.println("5	Refrigerante      R$ 1.50");
		
		System.out.println("");
		System.out.print("Insira o código do item e a quantidade:");
		codigoItem = sc.nextInt();
		quantidadeItem = sc.nextInt();
		
		
		
		if (codigoItem == 1) {
			total = quantidadeItem * 4.00;
			
		} else if (codigoItem == 2) {
			total = quantidadeItem * 4.50;
			
		} else if (codigoItem == 3) {
			total = quantidadeItem * 5.00;
			
		} else if (codigoItem == 4) {
			total = quantidadeItem * 2.00;
			
		} if (codigoItem == 5) {
			total = quantidadeItem * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();

	}

}
