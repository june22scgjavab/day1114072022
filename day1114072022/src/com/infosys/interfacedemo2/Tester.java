package com.infosys.interfacedemo2;

public class Tester {

	public static void main(String[] args) {
	    IEmployee employee=null;
		RegularEmployee regularEmployee=new RegularEmployee();
		employee=regularEmployee;
		displayDetails(employee);
		TemporaryEmployee temporaryEmployee=new TemporaryEmployee();
	    employee=temporaryEmployee;	
		displayDetails(employee);

	}

	private static void displayDetails(IEmployee emp) {
		emp.work();
		
	}

	

}
