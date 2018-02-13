package com.home.calculator.intf;

public interface Operation<T extends Object> {
	T execute(T arg1, T arg2);
}
