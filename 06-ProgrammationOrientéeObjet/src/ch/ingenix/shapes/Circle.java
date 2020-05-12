package ch.ingenix.shapes;

import java.awt.Point;

public class Circle extends Shape {

	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	private double radius;
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Circle() {
		super();
		setRadius(1);
	}
	
	public Circle( Point center, double radius ) {
		super(center);
		setRadius(radius);
	}

	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = Math.abs(radius);
	}
	
	//------------------------------------------------------------
	// Classes of method
	//------------------------------------------------------------
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		System.out.println( getShapeName() + " - Un cercle positionné en " + this.getCenter() + " et de rayon " + radius );
	}
}
