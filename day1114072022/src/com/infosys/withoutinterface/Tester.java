package com.infosys.withoutinterface;

public class Tester {

	public static void main(String[] args) {
	
		RegularEmployee regularEmployee=new RegularEmployee();
		TemporaryEmployee temporaryEmployee=new TemporaryEmployee();
		displayDetails(regularEmployee);
		displayDetails(temporaryEmployee);

	}

	private static void displayDetails(TemporaryEmployee temporaryEmployee) {
		temporaryEmployee.work();
		
	}

	private static void displayDetails(RegularEmployee regularEmployee) {
		regularEmployee.work();
		
	}

}
