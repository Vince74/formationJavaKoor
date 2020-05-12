package ch.ingenix.shapes;

import java.awt.Point;

public class Triangle extends Shape {
	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	private double length;
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Triangle() {
		super();
		setLenght(1);
	}
	
	public Triangle( Point center, double length ) {
		super(center);
		setLenght(length);
	}
	
	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public double getLenght() {
		return length;
	}
	
	public void setLenght(double length) {
		this.length= Math.abs(length);
	}
	
	//------------------------------------------------------------
	// Classes of method
	//------------------------------------------------------------
	@Override
	public double area() {
		return Math.pow(length, 2);
	}
 
	@Override
	public void draw() {
		System.out.println( getShapeName() + " - Un triangle positionné en " + this.getCenter() + " et de coté " +  length );
	}
}
