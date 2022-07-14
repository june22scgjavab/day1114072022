package com.infosys.interfacedemo5;

public class Tester {

	public static void main(String[] args) {
		ICalculator3 calc=new Number();
	    calc.display();
	    System.out.println(calc.add(4, 5));
	    System.out.println(calc.subtract(5, 1));
	    System.out.println(calc.multiply(4, 5));
	    System.out.println(calc.divide(10, 2));
	}  

}
