package com.home.calculator.intf;

public interface OperationFactory<T> {

	T getOpInstance(String op);

}
