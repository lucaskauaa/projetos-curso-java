package entities;

public class BankAccount {
	private final int NUMBER;
	private String holderName;
	private double balance;
	
	public BankAccount (int number, String holderName, double balance) {
		NUMBER = number;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public BankAccount (int number, String holderName) {
		NUMBER = number;
		this.holderName = holderName;
	}
	
	public int getNUMBER() {
		return NUMBER;
	}

	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName (String holderName) {
		this.holderName = holderName;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void deposit (double balance) {
		this.balance += balance;
	}
	
	public void whithdrawal (double withdrawal) {
		double whithdrawalFee = 5.0;
		balance -= withdrawal + whithdrawalFee;
	}

	public String toString() {
		return "Account: " +  getNUMBER() + ", Holder: " + getHolderName() + ", Balance: $ " + String.format("%.2f", getBalance());
	}
}
