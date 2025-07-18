package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount () {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan (Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.00;
		}
	}
	
	@Override
	public void withdrawal(Double amount) {
		super.withdrawal(amount);
		balance -= 2.0;
	}
}
