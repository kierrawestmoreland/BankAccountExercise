package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class AccountFactoryTest {

	@Test
	public void shouldReadName() throws IOException {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\Week_3\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\SavingsAccountInfo";
		//should be the actual file path && should be reading from the text file
		
		//act
		Account account = underTest.read(filePath);
		String name = account.getName();
		//assert
		Assert.assertEquals("Jane Doe", name);
	}

	@Test
	public void shouldReadID() throws IOException {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\Week_3\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\SavingsAccountInfo";
		//should be the actual file path && should be reading from the text file
		
		//act
		Account account = underTest.read(filePath);
		String accountID = account.getAccountID();
		//assert
		Assert.assertEquals("121343565", accountID);
	}
	
	@Test
	public void shouldReadAccountBalance() throws IOException {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\Week_3\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\SavingsAccountInfo";
		//should be the actual file path && should be reading from the text file
		
		//act
		Account account = underTest.read(filePath);
		String accountBalance = account.getAccountBalance();
		//assert
		Assert.assertEquals("876", accountBalance);
	}
	
	@Test
	public void shouldReadAccountType() throws IOException {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\Week_3\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\SavingsAccountInfo";
		//should be the actual file path && should be reading from the text file
		
		//act
		Account account = underTest.read(filePath);
		String accountType = account.getAccountType();
		//assert
		Assert.assertEquals("Savings", accountType);
	}
	
	@Test
	public void shouldReadAnotherAccountType() throws IOException {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\Week_3\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\CheckingAccountInfo";
		//should be the actual file path && should be reading from the text file
		
		//act
		Account account = underTest.read(filePath);
		String accountType = account.getAccountType();
		//assert
		Assert.assertEquals("Checking", accountType);
	}
	
}
