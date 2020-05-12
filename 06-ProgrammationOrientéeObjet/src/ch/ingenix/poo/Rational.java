package ch.ingenix.poo;

public class Rational {

	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	private int numerator;
	private int denominator;
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Rational() {
		setNumerator(0);
		setDenominator(1);
	}

	public Rational(int numerator, int denominator) {
		setNumerator(numerator);
		setDenominator(denominator);
	}

	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public int getNumerator() {
		return this.numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new RuntimeException("denominator cannot be null");
		}
		this.denominator = denominator;
	}
	
	//------------------------------------------------------------
	// Public methods
	//------------------------------------------------------------
	public String toString() {
		return String.format( "[%d/%d]", this.numerator, this.denominator);
	}
	
	public void printRational() {
		System.out.println(toString());
	}
	
	public Rational add( Rational r ) {
		// formule nath: a/b + c/d = (a*d + b*c) / (a*d)
		return new Rational( numerator*r.denominator+ denominator*r.numerator, denominator*r.denominator );
	}
	// ADD: sub, mult, div
	
	public boolean lessThan ( Rational r ) {
		return ((double)numerator / denominator < (double)r.numerator / r.denominator);
	}
	
	public boolean moreThan ( Rational r ) {
		return ((double)numerator / denominator > (double)r.numerator / r.denominator);
	}
	
	public boolean equal( Rational r ) {
		return ((double)numerator / denominator == (double)r.numerator / r.denominator);
	}
	
	public void simplify () {
		int divisor = pgcd( Math.max(numerator, denominator), Math.min(numerator,denominator));
		numerator /= divisor;
		denominator /= divisor;
	}

	//------------------------------------------------------------
	// Private methodes
	//------------------------------------------------------------
	private static int pgcd( int first, int second ) { // euclide
		while( second != 0 ) {
			int rest = first % second;
			first = second;
			second = rest;
		}
		return first;
	}
}
