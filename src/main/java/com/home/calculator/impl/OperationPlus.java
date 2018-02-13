package com.home.calculator.impl;

import com.home.calculator.intf.OperationNumber;
import com.home.calculator.intf.OperationString;

public class OperationPlus implements OperationNumber, OperationString {

	@Override
	public double execNumber(double valueOne, double valueTwo) {
		return (valueOne + valueTwo);
	}

	@Override
	public String execString(String stringOne, String stringTwo) {
		return (stringOne.concat(" ").concat(stringTwo));
	}

}
