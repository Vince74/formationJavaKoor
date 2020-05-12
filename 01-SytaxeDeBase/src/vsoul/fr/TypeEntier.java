package vsoul.fr;

public class TypeEntier {

	public static void main(String[] args) {
		
		int counter = 10;
		counter ++;
		System.out.println(counter);
		counter--;
		System.out.println(counter);
		
		int counter$1;
		
		counter$1 = 16;
		System.out.println(counter$1);
		
		//----------------------------------------------
		// Les Types
		//----------------------------------------------
		{
			// Les 4 types entiers (byte, short, int, long)
			byte montant = 100;
			System.out.println(montant);
			short monShort = 32767;
			System.out.println(monShort);			
			int monInt = 1_000_000_000;
			System.out.println(monInt);		
			long monLong = 17_000_000_000_000_000L;
			System.out.println(monLong);		
			
			// 4 bases numériques (décimale, binaire, octal, hexadécimale)
			int decimalValue = 10;
			int binaryValue = 0b1000110; // 2 + 4 + 64
			System.out.println(decimalValue + " - " + binaryValue );		
			int octValue = 010;				// !! attention quand ca commence par 0 c'est de l'octal 0 - 7
			System.out.println(octValue );	
			int hexaValue = 0xff;				// !! attention quand ca commence par 0 c'est de l'octal 0 - 7
			System.out.println(hexaValue );		
		}
	}

}
