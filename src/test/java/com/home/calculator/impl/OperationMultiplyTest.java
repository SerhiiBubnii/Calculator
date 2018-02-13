package com.home.calculator.impl;

import org.junit.Assert;
import org.junit.Test;

public class OperationMultiplyTest {

	@Test
	public void testExecNumber() {
		OperationMultiply multiply = new OperationMultiply();
		double res = multiply.execNumber(15, 3);
		Assert.assertEquals(45.0, res, 0.0);
	}

	@Test
	public void testExecString() {
		OperationMinus minus = new OperationMinus();
		String res = minus.execString("he", "ha");
		Assert.assertEquals(res, "he");
	}
}
