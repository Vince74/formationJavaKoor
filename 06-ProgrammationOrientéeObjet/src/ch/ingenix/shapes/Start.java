package ch.ingenix.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {		
		// Object var = new Circle();
		// System.out.println(var);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add( new Circle() );
		shapes.add( new Circle( new Point(1,30), 10) );
		//shapes.add( new Shape() );
		shapes.add( new Square(new Point(11,12), 2 ) );
		shapes.add( new Triangle(new Point(20,150), 16) );
		
		for( Shape shape: shapes ) {
			System.out.println(shape.area());
			shape.draw();
		}
	}
}
