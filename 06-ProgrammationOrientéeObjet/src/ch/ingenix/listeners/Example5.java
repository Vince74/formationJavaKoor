package ch.ingenix.listeners;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example5 extends JFrame  {
	
	//------------------------------------------------------------
	// attributa
	//------------------------------------------------------------
	private static final long serialVersionUID = -6696154155329026354L;
	private JButton btnClickMe = new JButton( "Click Me!");
	private JButton btnPushMe = new JButton( "Push Me!");
	private JButton btnActivateMe = new JButton( "Activate Me!");
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Example5() {
		super("Implementation d'interface");
		this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		//btnClickMe.setBounds(10, 10, 120, 30 ); // si pas setLayout FlowLayout
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		/*btnClickMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println( "Anonymous coucou");
				Example5.this.btnActivateMe.setForeground(Color.blue);
			}
		});*/

		// expression Lambda (a partir de java 8) 
		// inférence de type = recherche du type par déduction
		btnClickMe.addActionListener( (e) -> System.out.println("Ok 2 " + e.getSource()));
		// btnClickMe.addActionListener( (e, e1) -> System.out.println("Ok 1 " + e.getSource())); bug car qu'un seul paramètre

		// 3ieme cas: façon
		// syntaxe sans parenthèse si pas e n'a pas de type et s'il y a qu'un seul paramètre e
		btnClickMe.addActionListener( e -> System.out.println("Ok 3 " + e.getSource()));
 
		// 4ieme cas:
		btnClickMe.addActionListener( (event) -> {
			System.out.println( "ok 4 " + event.getSource());
			
		});
		
		// 5ième cas: appel à une methode portée par la classe en cours (Example5)
		// référence sur méthode (ou pointeur sur methode, mais terme pas utilisé en Java)
		btnClickMe.addActionListener( this::btnClickMeListener );
		
		this.setSize( 600, 400 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	// method 5ieme cas appelé par reférence de methode dans le constructor
	private void btnClickMeListener( ActionEvent event ) {
		System.out.println( event.toString());
	}
	
	public static void main(String [] args ) {
		new Example5();
	}
}
