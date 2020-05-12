package ch.ingenix.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class TestCollections {

	public static void main(String[] args) throws Exception {

		ArrayList<String> languages = new ArrayList<>();

		languages.add("Visvual Basic");
		languages.add("C");
		languages.add("Java");
		languages.add("Pythom");
		languages.add("c++");

		languages.sort( new Comparator<String>() {
			@Override
			public int compare (String l1, String l2 ) {
				return l1.compareToIgnoreCase(l2);
			}
		});

//		for ( String string: languages ) {
//			System.out.println( string );
//		}

		languages.forEach(System.out::println );
	}
}
