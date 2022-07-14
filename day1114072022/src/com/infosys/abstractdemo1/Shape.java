package com.infosys.abstractdemo1;

public abstract class Shape { // Writing class as an abstract means class is incomplete as we can have one or more
	// abstract methods alongwith the concrete methods ( methods with body)
	// so in our example setX(), getX() are the concrete method
 protected float x;
 protected float y;
/**
 * @return the x
 */
public float getX() {
	return x;
}
/**
 * @param x the x to set
 */
public void setX(float x) {
	this.x = x;
}
/**
 * @return the y
 */
public float getY() {
	return y;
}
/**
 * @param y the y to set
 */
public void setY(float y) {
	this.y = y;
}
 //public float calculateArea();  //This method requires a body instead of a semicolon
public abstract float calculateArea(); // Using abstract with a method means the method is not having a body
}
