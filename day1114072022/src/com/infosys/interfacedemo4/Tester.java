package com.infosys.interfacedemo4;

public class Tester {

	public static void main(String[] args) {
		Number number=new Number();
		System.out.println(number.add(1, 2));
		System.out.println(number.subtract(1, 2));
		System.out.println(number.divide(1, 2));
		System.out.println(number.multiply(1, 2));
		ICalculator2 calc1=number;
		int result=calc1.add(1, 2);
		System.out.println(result);
		result=calc1.subtract(4, 2);
		System.out.println(result);
		System.out.println(calc1.multiply(2,3));
		
		calc1.divide(6, 3);
	}

}
