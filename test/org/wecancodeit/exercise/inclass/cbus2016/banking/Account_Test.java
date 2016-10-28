package org.wecancodeit.exercise.inclass.cbus2016.banking;


import org.junit.Assert;
import org.junit.Test;


public class Account_Test {

	@Test
	public void getBalance() {

		Account_Classes underTest = new Account_Classes();
		int actual = (int) underTest.showBalance();
		Assert.assertEquals(0, actual);
	}
	

}
