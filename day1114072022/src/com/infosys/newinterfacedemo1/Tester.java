package com.infosys.newinterfacedemo1;

public class Tester {

	public static void main(String[] args) {
		EmployeeContract employee=new Employee();
		System.out.println(employee.calculateSalary());
		System.out.println(employee.getIncentives());
		//System.out.println(employee.numberOfHolidays());
		System.out.println(EmployeeContract.numberOfHolidays());
		System.out.println(Employee.numberOfHolidays());
		System.out.println(employee.getIncentives());
	}

}
