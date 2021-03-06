package mpp.demos.lecture5.factorymethods2.windows;

import mpp.demos.lecture5.factorymethods2.RuleSet;
import mpp.demos.lecture5.factorymethods2.rulesets.RuleException;
import mpp.demos.lecture5.factorymethods2.rulesets.RuleSetFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerProfileWindow extends JFrame {
	public CustomerProfileWindow() {
		JButton button = new JButton("Update Profile Info");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				RuleSet custProfileRules = RuleSetFactory.getRuleSet(CustomerProfileWindow.this);
				try {
					custProfileRules.applyRules(CustomerProfileWindow.this);
					//if rules pass...
					//submit data
				} catch(RuleException e) {
					JOptionPane.showMessageDialog(CustomerProfileWindow.this,                                                    
	                        "Error: "+e.getMessage(),
	                        "Error", 
	                        JOptionPane.ERROR_MESSAGE);

				}
			}
			
		});
		JPanel mainPanel = new JPanel();
		mainPanel.add(button);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(320, 240); 
	}
	
	
	private static final long serialVersionUID = -5043042115289288143L;

}
