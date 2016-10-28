package org.wecancodeit.exercise.inclass.cbus2016.banking;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void shouldHaveBe300Balance() {
		DebitAccount underTest = new SavingsAccount(300);
		int getMinSavingsBalance = underTest.getSavingsBalance();
		Assert.assertEquals(300, getMinSavingsBalance);
	}
	
	@Test
	public void initialAccountShouldHave1200 () {
		DebitAccount underTest = new SavingsAccount(1200);
		Assert.assertEquals(1200, underTest.getBalance());
	}
	
	@Test
	public void shouldWithrdawWithBalanceLeftOf750(){
		DebitAccount underTest = new DebitAccount(1200); //everytime we start a new test it's initially at 0
		underTest.withdrawFunds(450);
		Assert.assertEquals(750, underTest.getBalance());
		
		}
}
