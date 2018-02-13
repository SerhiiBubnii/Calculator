package com.home.calculator.impl;

import java.util.HashSet;

import com.home.calculator.intf.OperationNumber;
import com.home.calculator.intf.OperationString;

public class OperationMultiply implements OperationNumber, OperationString {

	@Override
	public double execNumber(double valueOne, double valueTwo) {
		return (valueOne * valueTwo);
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

		h1.retainAll(h2);
		String result = String.valueOf(h1);

		return result;
	}
}
