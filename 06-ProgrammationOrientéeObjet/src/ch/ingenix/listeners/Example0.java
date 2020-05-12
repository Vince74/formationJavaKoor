 package ch.ingenix.listeners;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example0 extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4684777043598101508L;
	
	//------------------------------------------------------------
	// attributs
	//------------------------------------------------------------
	private JButton btnClickMe = new JButton( "Click Me!");
	private JButton btnPushMe = new JButton( "Push Me!");
	private JButton btnActivateMe = new JButton( "Activate Me!");
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Example0() {
		super("Implementation d'interface");
		this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		//btnClickMe.setBounds(10, 10, 120, 30 ); // si pas setLayout FlowLayout
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		this.setSize( 600, 400 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String [] args ) {
		new Example0();
	}
}
