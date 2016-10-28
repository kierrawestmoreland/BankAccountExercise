package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountFactory {

	private String invalidAccount;

	public Account read(String filePath) throws IOException {
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		String name = buffer.readLine();
		String accountID = buffer.readLine();
		String accountBalance = buffer.readLine();
		String accountType = buffer.readLine();
		
		Account account = new Account(name, accountID, accountBalance, accountType);//why would this = null
		
		buffer.close();
		file.close();
		
		if(accountType.equalsIgnoreCase("Checking")){
			account = madeNewCheckingAccount(name, accountID, accountBalance);
		}
		else if(accountType.equalsIgnoreCase("Savings")){
			account = madeNewSavingsAccount(name, accountID, accountBalance);
		}
		else
			account = invalidAccountType(invalidAccount);
		return account;
		
	}

	private Account invalidAccountType(String invalidAccount) {
		// TODO Auto-generated method stub
		return new Account(invalidAccount);
	}

	private Account madeNewSavingsAccount(String name, String accountID,
			String accountBalance) {
		// TODO Auto-generated method stub
		return new SavingsAccount(name, accountID, accountBalance);
	}

	private Account madeNewCheckingAccount(String name, String accountID,
			String accountBalance) {
		// TODO Auto-generated method stub
		return new CheckingAccount(name, accountID, accountBalance);
	}
}
