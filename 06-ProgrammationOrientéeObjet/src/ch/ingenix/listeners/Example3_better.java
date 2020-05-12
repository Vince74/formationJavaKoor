package ch.ingenix.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example3_better extends JFrame  {
	
	//------------------------------------------------------------
	// attribut
	//------------------------------------------------------------
	private static final long serialVersionUID = -6696154155329026354L;
	private JButton btnClickMe = new JButton( "Click Me!");
	private JButton btnPushMe = new JButton( "Push Me!");
	private JButton btnActivateMe = new JButton( "Activate Me!");
	
	private int demo = 10;
	
	//------------------------------------------------------------
	// constructors
	//------------------------------------------------------------
	public Example3_better() {
		super("Implementation d'interface");
		this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		btnClickMe.addActionListener(new BtnClickMeListernerInner());
		
		this.setSize( 600, 400 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	//------------------------------------------------------------
	// main
	//------------------------------------------------------------
	public static void main(String [] args ) {
		new Example3_better();
	}
	
	//------------------------------------------------------------
	// inner class 
	//------------------------------------------------------------
	private class BtnClickMeListernerInner implements ActionListener {
		
		private int demo = 2000;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(this.demo);
			System.out.println(Example3_better.this.demo);
			setTitle( "Click inner");
			btnPushMe.setText( "Example 3");
		}
	}
}
