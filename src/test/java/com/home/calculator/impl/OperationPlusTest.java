package com.home.calculator.impl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OperationPlusTest {

	@Test
	public void testExecNumber() {
		OperationPlus plus = new OperationPlus();
		double res = plus.execNumber(23, 3);
		Assert.assertEquals(26, res, 0.0);
	}

	@Test
	public void testExecString() {
		OperationPlus plus = new OperationPlus();
		String res = plus.execString("Hello", "World");
		Assert.assertEquals(res, "Hello World");
	}

}
