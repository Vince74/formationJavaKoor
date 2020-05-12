package ch.ingenix.agenda;

public class Employee extends Person {

	//------------------------------------------------------------
	// attributs de Classe
	//------------------------------------------------------------
	public static final int SMIC = 1500;
	private double salary;	

	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Employee() {
		//super();
		this.setSalary(SMIC);
	}

	public Employee(String firstName, String lastName, String email, double salary) {
		super(firstName, lastName, email);
		this.setSalary(salary);
	}
	
	//------------------------------------------------------------
	// properties (getters / setters)
	//------------------------------------------------------------
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if ( salary < 0 ) {
			throw new RuntimeException("Salary must be greater than 0.");
		}
		this.salary = salary;
	}
	
	//------------------------------------------------------------
	// class methods
	//------------------------------------------------------------
	@Override
	public String toString() {
		return super.toString() + " , Salary: " + this.salary + " EUR";
	}

	

}
