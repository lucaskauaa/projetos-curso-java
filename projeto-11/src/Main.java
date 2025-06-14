import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempoDeJogo;
		
		System.out.println("Insira a hora inicial e a hora final:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial >= horaFinal) {
			tempoDeJogo = 24 - horaInicial + horaFinal;
		} else {
			tempoDeJogo = horaFinal - horaInicial;
		}
		
		System.out.println("O JOGO DUROU " + tempoDeJogo + " HORAS(S)");

		
		sc.close();

	}

}
