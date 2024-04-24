package com.mock;

public class CalDummy {
	
	public  int add(int a, int b) {
		return a+b;
	}
	
	public  int multiply(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		CalDummy calDummy = new CalDummy();
		int a = 5;
		int b = 10;
		
		int sum = calDummy.add(3, 1);
		System.out.println("sum is "+ sum);
		
		int mul = calDummy.multiply(5, 7);
		System.out.println(mul);
	}

}
