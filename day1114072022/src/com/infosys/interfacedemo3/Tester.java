package com.infosys.interfacedemo3;

public class Tester {

	public static void main(String[] args) {
		Number number=new Number();
		System.out.println(number.add(1, 2));
		System.out.println(number.subtract(1, 2));
		System.out.println(number.divide(1, 2));
		System.out.println(number.multiply(1, 2));
		ICalculator1 calc1=number;
		calc1.add(1, 2);
		calc1.subtract(4, 2);
		//calc1.multiply(2,3);
		
	}

}
