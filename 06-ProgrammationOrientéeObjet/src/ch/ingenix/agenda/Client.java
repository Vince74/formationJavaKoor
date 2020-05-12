package ch.ingenix.agenda;

public class Client extends Person {
	
	static private int nbClient = 0; 
	private int idClient;
		
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Client() {
		//super();
		nbClient++;
		this.setIdClient(nbClient);
	}
	
	public Client(String firstName, String lastName, String email ) {
		super(firstName, lastName, email);
		this.setIdClient(++nbClient);
	}

	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		if ( idClient < 1 ) {
			throw new RuntimeException( "Client Id must be greater than 0.");
		}
		this.idClient = idClient;
	}

	//------------------------------------------------------------
	// class methods
	//------------------------------------------------------------
	@Override
	public String toString() {
		return super.toString() + ", Identifier: " + this.idClient;
	}
}