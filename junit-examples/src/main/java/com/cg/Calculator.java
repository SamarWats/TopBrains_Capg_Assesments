package com.cg;

public class Calculator {
	public int calculate(int a, int b) {
		return a + b;
		}

	public boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
}