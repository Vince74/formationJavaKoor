package vsoul.fr;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class TypeFloat {

	public static void main(String[] args) {
		
		float floatValue = 3.6f;					// 3.14f  constante float
		double d = 3.141595654;			// 3.14   constante double
		
		System.out.println(floatValue + d );
		
		// representations
		double first = 1.234 ;      // syntxe classique
		double second = -1234e-3;   // Notation exponentielle (matrice - exposant)
		
		System.out.println(first + " - " + second );
		
		first = Double.MIN_VALUE;
		second = Double.MAX_VALUE;
		
		boolean a = true;
		int b = 1;
		
		if ( a && b== 1 ) {			
			System.out.println( "in block - " + b);
		}
		System.out.println( "out of block - " + b);
		
		File [] files = new File ( "." ).listFiles();
		for ( File file : files ) {
			System.out.format("%s %d %b %T %s\n", file.getName(), file.getFreeSpace(), file.isDirectory(), file.lastModified(), file.lastModified() );
		}
			
		
		  
	} 

}
