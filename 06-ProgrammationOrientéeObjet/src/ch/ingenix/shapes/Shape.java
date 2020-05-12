package ch.ingenix.shapes;

import java.awt.Point;
import java.text.Format;

public abstract class Shape {

	private static int nb = 0;
	
	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	private Point center;
	private String shapeName;

	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Shape() {
		this( new Point(0, 0));
	}
	
	public Shape(Point center) {
		this.setCenter(center);
		this.setShapeName(String.format("Shape-%d", ++nb));
	}
	
	public Shape(Point center, String name) {
		this.setCenter(center);
		this.setShapeName(name);
	}
	
	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		if (center == null)
			throw new NullPointerException( "Point must be set.");
		this.center = center;
	}

	public String getShapeName() {
		return shapeName;
	}
	
	public void setShapeName(String name) {
		this.shapeName = name;
	}
	
	//------------------------------------------------------------
	// Public methods
	//------------------------------------------------------------
	
	//------------------------------------------------------------
	// Abstract method
	//------------------------------------------------------------
	public abstract double area();
	public abstract void draw();

}