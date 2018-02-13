package com.home.calculator.impl;

import java.util.HashSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.home.calculator.intf.OperationNumber;
import com.home.calculator.intf.OperationString;

public class OperationDivision implements OperationNumber, OperationString {

	private static final Logger logger = LogManager.getLogger(OperationDivision.class.getName());

	@Override
	public double execNumber(double valueOne, double valueTwo) {
		if (valueTwo == 0) {
			logger.error("divider is 0 ");
			throw new IllegalArgumentException("divider is 0");
		}
		return (valueOne / valueTwo);
	}

	@Override
	public String execString(String stringOne, String stringTwo) {
		HashSet<Character> h1 = new HashSet<>();
		HashSet<Character> h2 = new HashSet<>();

		for (int i = 0; i < stringOne.length(); i++) {
			h1.add(stringOne.charAt(i));
		}

		for (int i = 0; i < stringTwo.length(); i++) {
			h2.add(stringTwo.charAt(i));
		}

		h1.removeAll(h2);
		String result = String.valueOf(h1);

		return result;
	}
}
