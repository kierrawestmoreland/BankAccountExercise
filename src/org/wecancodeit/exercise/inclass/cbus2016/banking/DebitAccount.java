package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class DebitAccount extends Account {

	protected int getMinSavingsBalance;

	public DebitAccount() {
		super(name, accountID, accountBalance, accountType);
	}

	public void depositFunds(int transaction) {
		// same as balance = balance + transaction
		balance += transaction;
	}

	public void withdrawFunds(int transaction) {
		balance -= transaction;
	}

	public int getSavingsBalance() {
		getMinSavingsBalance = 300;
		return getMinSavingsBalance;
	}

	//public void withdrawFunds(int withdrawalAmount) {
	//	balance -= withdrawalAmount;		
	//} originally from one of the child classes

}