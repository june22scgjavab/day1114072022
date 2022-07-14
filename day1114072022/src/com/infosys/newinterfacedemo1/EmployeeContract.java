package com.infosys.newinterfacedemo1;

public interface EmployeeContract {
double calculateSalary();
 default double getIncentives() {
	 return 1000;
 }
 static int numberOfHolidays() {
	 return 10;
 }
}


