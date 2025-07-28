package entities;

import exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawaLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawaLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawaLimit = withdrawaLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawaLimit() {
		return withdrawaLimit;
	}

	public void withdrawal(Double amount) {
		if (amount > getWithdrawaLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		} else if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		this.balance -= amount;
	}
	
}
