package com.home.calculator.impl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OperationMinusTest {

	@Test
	public void testExecNumber() {
		OperationMinus minus = new OperationMinus();
		double res = minus.execNumber(15, 3);
		Assert.assertTrue(res == 12);
	}

	@Test
	public void testExecString() {
		OperationMinus minus = new OperationMinus();
		String res = minus.execString("Hello World", "World");
		Assert.assertEquals(res, "Hello ");
	}

}
