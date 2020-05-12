package ch.ingenix.poo;

public class Mathematiques {
	
	public static int pgcd( int first, int second ) {
		while( second != 0 ) {
			int rest = first % second;
			first = second;
			second = rest;
		}
		return first;
	}

}
