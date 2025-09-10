package application;

import entities.Account;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account(333, "Lucas", 300.00);
		
		Account acc2 = new SavingsAccount(777, "Isabelle", 300.00, 0.01);
		
		acc1.withdrawal(10.00);
		
		acc2.withdrawal(10.00);
		
		System.out.println(acc1.getBalance());
		
		System.out.println(acc2.getBalance());
		
	}

}
