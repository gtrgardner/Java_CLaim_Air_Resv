package com.air_resv_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserStart extends JFrame {

	/**
	 * 	A simple start screen that gives the user a choice to either register a
	 * 	new account or login to an existing one.
	 */

	private static final long serialVersionUID = -7366367431620334394L;
	private JLabel labelTitle; 		// Holds screen's title
	private JLabel labelReg; 		// Registration description label
	private JButton regButton; 		// Registration button
	private JLabel labelLog; 		// Login description label
	private JButton logButton; 		// Login button

	public UserStart() {

//		Sets the frame's size, screen orientation, close operation.

		EventQueue.invokeLater(() -> {
		});
		setTitle("Welcome to Claim Air");
		setSize(new Dimension(500, 75));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
//      Create a view with a registration and login option
	public void createStartView() {		

		JFrame frame = new JFrame();
		labelTitle = new JLabel("Welcome to Claim Air!");
		JPanel panel0 = new JPanel();
		frame.add(panel0);
		panel0.setLayout(new BorderLayout());
		panel0.setBackground(Color.cyan);
		getContentPane().add(panel0, BorderLayout.NORTH);
		panel0.add(labelTitle, BorderLayout.NORTH);

		labelReg = new JLabel("Register A New Account");
		labelLog = new JLabel("Login");
		regButton = new JButton("Register");
//		Add ActionListener to access Registration window on button click.
		regButton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						UserRegistration ur = new UserRegistration();
						ur.createRegView();
						ur.setVisible(true);
						userStartClose();
						}
				});
//		Add ActionListener to access Login window on button click.
		logButton = new JButton("Login");
		logButton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						UserLogin ul = new UserLogin();
						ul.createLoginView();
						ul.setVisible(true);
						userStartClose();
					}
				});
		JPanel panel1 = new JPanel();
		frame.add(panel1);
		panel1.setLayout(new GridLayout(2, 2));
		panel1.setBackground(Color.lightGray);
		panel0.add(panel1, BorderLayout.CENTER);
		panel1.add(labelReg);
		panel1.add(regButton);
		panel1.add(labelLog);
		panel1.add(logButton);

	}
	public void userStartClose(){
	
		dispose();
	}

}



