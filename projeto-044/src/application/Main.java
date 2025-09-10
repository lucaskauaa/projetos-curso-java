package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolderName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char deposit = sc.next().charAt(0);
		
		if (deposit == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolderName, initialDeposit);
			
		} else {
			bankAccount = new BankAccount(accountNumber, accountHolderName);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(bankAccount.toString());
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		bankAccount.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(bankAccount.toString());
		
		System.out.println("");
		System.out.print("Enter a withdrawl value: ");
		bankAccount.whithdrawal(sc.nextDouble());
		System.out.println("Updater account data:");
		System.out.println(bankAccount.toString());
		
		sc.close();
	}

}
