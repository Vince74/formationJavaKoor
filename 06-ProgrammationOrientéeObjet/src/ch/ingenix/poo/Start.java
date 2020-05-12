package ch.ingenix.poo;

public class Start {

	public static void main(String[] args) {
		Rational r1 = new Rational(2,2);
		System.out.println( r1 );
		Rational r2 = new Rational(3,2);
		System.out.println( r2 );
				
		Rational result = r1.add(r2);
		System.out.println( r2 );
		
		result.simplify();	
		System.out.println( result );

		System.out.println( "r < r2 - " + r1.lessThan(r1));
		System.out.println( "r > r2 - " + r1.moreThan(r1));
		System.out.println( "r == r2 - " + r2.equal(r1));
	}
}
