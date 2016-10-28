package org.wecancodeit.exercise.inclass.cbus2016.banking;
/*
*//**
 * This is the superclass. Things here are shared by subclasses.
 * 
 * @author WeCanCodeIT
 * 
 */
public class Account {
	
	private String name;
	protected int balance;//lets the child class do math operations on the variable, but the variable will keep the original value from this class
	private String accountID;
	private String accountBalance;
	private String accountType;
	private int withdraw;
	private int deposit;


public Account (String newName, String newAccountID, String newAccountBalance, String newAccountType){
	name = newName;
	accountID = newAccountID;
	accountBalance = newAccountBalance;
	accountType = newAccountType;
}

	public Account(String invalidAccount) {
	// TODO Auto-generated constructor stub
		System.out.println("Please enter in valid account type.");
}

	public int getBalance() {
		return balance;
	}
	
	protected int withdrawFunds(){
		return withdraw;
	}
	
	protected int depositFunds(){
		return deposit;
	}
	
	public String getName(){
		//System.out.println(name);
		return name;
	}

	public String getAccountID() {
		// TODO Auto-generated method stub
		return accountID;
	}

	public String getAccountBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

	public String getAccountType() {
		// TODO Auto-generated method stub
		return accountType;
	}
	

}