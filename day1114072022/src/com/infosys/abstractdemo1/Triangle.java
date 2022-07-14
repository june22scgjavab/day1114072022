package com.infosys.abstractdemo1;

/*public  class Triangle extends Shape {

	Compilation error as we have not implemented the abstract method
	
	 
}*/

/*public abstract class Triangle extends Shape {

No compilation error as the class is declared as abstract
for not implementing/overriding the abstract method of shape

 
}*/

public  class Triangle extends Shape {

	
	  @Override public float calculateArea() { 
	  float area=(x*y)/2;
	  return area;
	  
	  }
	 
}
