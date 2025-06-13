import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double hora;
		
		System.out.println("Que horas são ?");
		hora = sc.nextDouble();
		
		if (hora < 12.00) {
			System.out.println("Bom dia");
		} else if (hora < 18.00) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}

}
