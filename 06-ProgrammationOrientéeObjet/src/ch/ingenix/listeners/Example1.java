package ch.ingenix.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example1 extends JFrame implements ActionListener {
	
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
	public Example1() {
		super("Implementation d'interface");
		this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		//btnClickMe.setBounds(10, 10, 120, 30 ); // si pas setLayout FlowLayout
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		btnClickMe.addActionListener(this);
		btnPushMe.addActionListener(this);
		btnActivateMe.addActionListener(this);
		
		this.setSize( 600, 400 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String [] args ) {
		new Example1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == btnClickMe ) {
			System.out.println( "btnClickMe");
		} else if ( e.getSource() == btnPushMe ) {
			this.setTitle( "Push Me");
		} else {
			this.setTitle( "Other ");
		}
	}
}
