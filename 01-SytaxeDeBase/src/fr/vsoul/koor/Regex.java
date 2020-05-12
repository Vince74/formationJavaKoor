package fr.vsoul.koor;

public class Regex {

	public static void isValidPhoneNumber( String phoneNumber ) {
		String modifyPhoneNumber = phoneNumber.replaceAll("", "");
		System.out.println(modifyPhoneNumber);
	}

	public static boolean isValidDate( String date ) {
		return date.matches("^(\\d\\d)/(\\d\\d)/(\\d\\d\\d\\d)$" );
	}
	
	public static boolean isValidDate2( String date ) {
		return date.matches( "^(0[1-9]|[12][0-9]|3[01])/0[1-9]|1[012]/(19|20)([0-9]{2})$" );
	}
	
	public static boolean isValidEmail( String eMail ) {
		return eMail.matches("^.+@.+\\..+$" );
	}
	
	public static boolean isValidEmail2( String eMail ) {
		return eMail.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_-]+\\.[a-z]{2,}$" );
	}
	
	public static void main(String[] args) {
		String myPhone = "11 22 33 44 55";
		System.out.println(myPhone.replaceAll("\\d", "X"));
		System.out.println(myPhone.replaceFirst("\\d\\d", "XX"));
		
		String myText = "This \t\t is a simple  \n\n   expression    but     with\ta lot   of      unusefull       separators     .";
		System.out.println(myText.replaceAll("\\s{2,}", " "));
		System.out.println(myText.replaceAll("\\s+", " "));

		System.out.println( isValidDate("20/151/1965") );
		System.out.println( isValidDate2("20/11/1965") );
	}
}
