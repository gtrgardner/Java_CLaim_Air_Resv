package com.air_resv_interface;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.*;


public class UserRegistration extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1953448450347651669L;
	//private JTextField custid;
	private JLabel userNameLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel dobLabel;
	private JLabel emailLabel;
	
	private JTextField userNameText;
	//private String password;
	private JTextField firstNameText;
	private JTextField lastNameText;
	private JTextField dobText;
	private JTextField emailText; 
	private JButton regSubmitBotton;
	
	public UserRegistration() {

		// Sets the frame's size, screen orientation, close operation.

		EventQueue.invokeLater(() -> {
		});
		setTitle("Welcome to Claim Air");
		setSize(new Dimension(500, 600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public void createRegView(){
		
		JPanel panelA = new JPanel();
		getContentPane().add(panelA);
		
	}

}
