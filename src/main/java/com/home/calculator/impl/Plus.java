package com.home.calculator.impl;

import com.home.calculator.intf.Operation;

public class Plus<T extends Object> implements Operation<T extends Object>{

	public T execute(T arg1, T arg2) {
		if (arg1 instanceof String) {
		}
		return null;
	}

	private T executeDouble(T arg1, T arg2) {
		return (T) ((Double) arg1 + (Double) arg2);
	}
}
