package com.mock;

public class CalculatorB {
	private CalculatorA calculatorA;

	public CalculatorB(CalculatorA calculatorA) {
		this.calculatorA = calculatorA;
	}

	public int performAddition(int a, int b) {
		return calculatorA.add(a, b);
	}

	public int performDivision(int a, int b) {
		return calculatorA.division(a, b);
	}

}
