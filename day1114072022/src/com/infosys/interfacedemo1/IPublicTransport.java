package com.infosys.interfacedemo1;

public interface IPublicTransport {
	double RATE = 12.0; // Rate per km
    double MIN_AMOUNT = 30.0;  // The variables are by default public,static and final
    double calculateFare();  // the method calculateFare() is by default public and abstract.
    
}


//In case of class the default access specifier is not public but
// it is default/package access specifier
/*
 *  public class Demo{
 *  
 *  void display(){ // The access specifier is not public and it is default
 *  
 *  }
 * 
 */