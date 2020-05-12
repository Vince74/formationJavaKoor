package ch.ingenix.agenda;

public class Person extends Object {

	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	private String firstName;
	private String lastName;
	private String email;
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Person() {
		this( "john", "Dow", "John.dow@ingenix.ch");
	}

	public Person(String firstName, String lastName, String email) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}

	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if ( firstName == null || firstName.trim().equals("")) {
			throw new RuntimeException("First name cannot be empty.");
		}
		this.firstName = firstName.trim().toLowerCase();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if ( lastName == null || lastName.trim().equals("")) {
			throw new RuntimeException("Bad format of email.");
		}
		this.lastName = lastName.trim().toUpperCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if ( email == null || ! email.matches( "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$")) {
			throw new RuntimeException("Bad format of email.");
		}
		this.email = email;
	}
	
	//------------------------------------------------------------
	// Public methods
	//------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Fist name: " + firstName + ", Last name: " + lastName + ", Email: " + email;
	}

	//------------------------------------------------------------
	// Private methods
	//------------------------------------------------------------


}
