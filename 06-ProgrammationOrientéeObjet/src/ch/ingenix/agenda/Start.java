package ch.ingenix.agenda;

import java.util.ArrayList;

public class Start {
	public static void main(String[] args) {

		/*Person james = new Person("James", "Bond", "007@mi6.fr" );
		System.out.println(james);
		
		Employee employee = new Employee("jason", "bourne", "jason.bourne@cia.com", 12_000);
		System.out.println(employee);
		
		Client client = new Client();
		System.out.println(client);

		Client white = new Client("Waklter", "White", "walter.white@narcos.mx" );
		System.out.println(white);
		
		Client willy = new Client("Willy", "Wonka", "willy.wonka@la-chocolaterie.mx" );
		System.out.println(willy);*/
		
		/*Person persons [] = new Person[4];
		persons[0] = new Person();
		persons[1] = new Employee("jason", "bourne", "jason.bourne@cia.com", 12_000);
		persons[2] = new Client("Waklter", "White", "walter.white@narcos.mx" );
		persons[3] = new Client("Willy", "Wonka", "willy.wonka@la-chocolaterie.mx" );
		*/
		
		ArrayList<Person> persons = new ArrayList<>();
		persons.add( new Person() );
		persons.add( new Employee("jason", "bourne", "jason.bourne@cia.com", 12_000));
		persons.add( new Client("Waklter", "White", "walter.white@narcos.mx" ));
		persons.add( new Client("Willy", "Wonka", "willy.wonka@la-chocolaterie.mx" ));
		
		for ( Person person : persons){
			System.out.println(person.getClass().getName() + " : " + person);
		}

		System.out.println("--------------------------");
		
		for ( Person person : persons){
			if (person instanceof Client ) {				
				System.out.println(person);
			}
		}
	}
}
