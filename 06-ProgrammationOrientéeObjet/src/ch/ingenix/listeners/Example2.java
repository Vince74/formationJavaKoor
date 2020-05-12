package ch.ingenix.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example2 extends JFrame  {
	
	//------------------------------------------------------------
	// attributa
	//------------------------------------------------------------
	private static final long serialVersionUID = -6696154155329026354L;
	private JButton btnClickMe = new JButton( "Click Me!");
	private JButton btnPushMe = new JButton( "Push Me!");
	public JButton btnActivateMe = new JButton( "Activate Me!");  // public permet de manupuler hors classe Example2
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Example2() {
		super("Implementation d'interface");
		this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		//btnClickMe.setBounds(10, 10, 120, 30 ); // si pas setLayout FlowLayout
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		btnClickMe.addActionListener(new BtnClickMeListerner());
		btnPushMe.addActionListener(new BtnPushMeListerner());
		btnActivateMe.addActionListener(new BtnActivateMeListerner());
		
		this.setSize( 600, 400 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public static void main(String [] args ) {
		new Example2();
	}
}


// Classe privée

class BtnActivateMeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Activate me 3.");
		
	}
	
}