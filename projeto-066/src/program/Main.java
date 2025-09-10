package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();

			System.out.print("Holder: ");
			String holder = sc.nextLine();

			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			sc.nextLine();

			System.out.print("Withdral limit: ");
			Double withdrawalLimit = sc.nextDouble();
			sc.nextLine();

			Account account = new Account(number, holder, balance, withdrawalLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			sc.nextLine();
			
			account.withdrawal(amount);
			
			System.out.printf("New Balance: %.2f", account.getBalance());

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		
		} catch (InputMismatchException e) {
			System.out.println("Invalid value!");
		}

		sc.close();
	}

}
