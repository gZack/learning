package mpp.demos.lecture5.prob1.samplecode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
	AddrWindow addrWin = new AddrWindow();
	ProfileWindow profWin = new ProfileWindow();
	public MainFrame() {
		JPanel mainPanel = new JPanel();
		JButton addrButton = new JButton("Go to Address Window");
		addrButton.addActionListener(new AddressWindowListener());
		JButton profileButton = new JButton("Go to Profile Window");
		profileButton.addActionListener(new ProfileWindowListener());
		mainPanel.add(addrButton);
		mainPanel.add(profileButton);
		getContentPane().add(mainPanel);
		pack();
		
	}
	
	class AddressWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			addrWin.setVisible(true);
			profWin.setVisible(false);
		}
	}
	class ProfileWindowListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			addrWin.setVisible(false);
			profWin.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		(new MainFrame()).setVisible(true);
	}

}
