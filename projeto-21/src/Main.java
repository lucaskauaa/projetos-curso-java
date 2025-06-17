import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senhaAtual = 2002;

		int testeDeSenha = sc.nextInt();
		
		while (testeDeSenha != senhaAtual) {
			System.out.println("Senha invalida");
			testeDeSenha = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
