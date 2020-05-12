package ch.ingenix.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BtnPushMeListerner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println( "Push me...");
		JButton btn = (JButton) e.getSource();
		Example2 frame = (Example2)btn.getTopLevelAncestor();
		frame.setTitle("Push me..."); 
		
		frame.btnActivateMe.setForeground( Color.red  );
		
		}

}
