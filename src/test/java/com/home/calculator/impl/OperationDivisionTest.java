package com.home.calculator.impl;

import org.junit.Assert;
import org.junit.Test;

public class OperationDivisionTest {

	@Test
	public void testExecNumber() {
		OperationDivision division = new OperationDivision();
		double res = division.execNumber(15, 6);
		Assert.assertTrue(res == 2.5);
	}

	@Test
	public void testExecString() {
		OperationMinus minus = new OperationMinus();
		String res = minus.execString("He", "H");
		Assert.assertEquals(res, "e");
	}
}
