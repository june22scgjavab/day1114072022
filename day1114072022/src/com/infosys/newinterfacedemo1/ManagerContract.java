package com.infosys.newinterfacedemo1;

public interface ManagerContract {
	default double getIncentives() {
		 return 3000;
	 }
}
