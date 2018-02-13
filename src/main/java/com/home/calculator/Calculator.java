package com.home.calculator;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.home.calculator.intf.*;

public class Calculator {

	private static final Logger log = LogManager.getLogger(Calculator.class.getName());

	public void exec() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first value:");
		String arg1 = scanner.nextLine();
		log.info("Read the first argument");

		System.out.println("Enter the operation:");
		String operation = scanner.nextLine();
		log.info("Read the operation");

		System.out.println("Enter the second value:");
		String arg2 = scanner.nextLine();
		log.info("Read the second argument");

		// Check for nonsense of the number
		if (!isNumber(arg1)) {
			log.info("Check for nonsense of the first number");

			if (!isNumber(arg2)) {
				log.info("Check for nonsense of the second number");

				// Operations on numbers
				System.out.print("Result:\t");

				OperationFactory<OperationNumber> operationFactory = new MyOpFactory<OperationNumber>();
				OperationNumber operationNumber = operationFactory.getOpInstance(operation);

				// Converts a string into a number
				double argOne = Double.parseDouble(arg1);
				double argTwo = Double.parseDouble(arg2);

				if (operationNumber != null) {
					System.out.println(operationNumber.execNumber(argOne, argTwo));
				} else {
					System.out.println("Unavailable operation!!!");
				}

			} else {
				calculateString(arg1, operation, arg2);
			}

		} else {
			calculateString(arg1, operation, arg2);
		}
	}

	private void calculateString(String arg1, String operation, String arg2) {
		// Operations on strings
		System.out.print("Result:\t");
		OperationFactory<OperationString> operationStrFactory = new MyOpFactory<OperationString>();
		OperationString operationString = operationStrFactory.getOpInstance(operation);

		if (operationString != null) {
			System.out.println(operationString.execString(arg1, arg2));
		} else {
			System.out.println("Unavailable operation!!!");
		}
	}

	private boolean isNumber(String arg1) {
		return arg1.matches("^\\D*$");
	}
}
