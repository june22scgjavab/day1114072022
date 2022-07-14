package com.infosys.newinterfacedemo1;

public class Employee implements EmployeeContract,ManagerContract {

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double getIncentives() {
		// TODO Auto-generated method stub
		return EmployeeContract.super.getIncentives();
	}

	/*
	 * public double getIncentives() { return 2000;
	 * 
	 * }
	 */
	public static int numberOfHolidays() {
		 return 30;
	 }
	
}

/*We dont need to override the default method of an interface but
 *  If we want , we can override
 */