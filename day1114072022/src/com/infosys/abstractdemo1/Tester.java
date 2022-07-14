package com.infosys.abstractdemo1;

public class Tester {

	public static void main(String[] args) {
		Shape shape=null; // So we create a reference variable of Shape abstract class
		//Shape shape1=new Shape();  // Cannot instantiate the type Shape
       
		/*
		 * triangle.setX(12); triangle.setY(20);
		 */
		Triangle triangle=new Triangle();
		shape=triangle;
		shape.setX(100);
		shape.setY(20);
		displayArea(shape);
        Rectangle rectangle=new Rectangle();
		/*
		 * rectangle.setX(30); rectangle.setY(2);
		 */
        shape=rectangle;
		shape.setX(100);
		shape.setY(20);
		displayArea(shape); 
   
		/*
		 * Triangle triangle=new Triangle();
		 * triangle.setX(12); 
		 * triangle.setY(20);
		 * displayArea(triangle);
		 * 
		 *  Rectangle rectangle=new Rectangle();
		 *  rectangle.setX(30); 
		 *  rectangle.setY(2);
		 *  displayArea(rectangle);
		 * 
		 * 
		 */
		
		
	}

	private static void displayArea(Shape sh) {
		float area=sh.calculateArea();
		System.out.println(area);
		
	}

}
