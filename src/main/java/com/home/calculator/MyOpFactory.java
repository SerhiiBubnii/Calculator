package com.home.calculator;

import com.home.calculator.impl.*;
import com.home.calculator.intf.*;

public class MyOpFactory<T> implements OperationFactory<T> {

	private OperationNumber operation;

	@Override
	public T getOpInstance(String operation) {

		switch (operation) {
		case "+": {
			this.operation = new OperationPlus();
			break;
		}
		case "-": {
			this.operation = new OperationMinus();
			break;
		}
		case "*": {
			this.operation = new OperationMultiply();
			break;
		}
		case "/": {
			this.operation = new OperationDivision();
			break;
		}
		default: {
			this.operation = null;
		}
		}
		return (T) this.operation;
	}
}