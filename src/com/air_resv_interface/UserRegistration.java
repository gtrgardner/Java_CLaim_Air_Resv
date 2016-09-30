package com.air_resv_interface;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.air_resv.dao.AirResvDAOImpl;
import com.air_resv.dao.Customer;

public class UserRegistration extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1953448450347651669L;
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel emailLabel;

	private JTextField userNameText;
	private JTextField passwordText;
	private JTextField firstNameText;
	private JTextField lastNameText;
	private JTextField emailText;
	private JButton regSubmitButton;

	public UserRegistration() {

		// Sets the frame's size, screen orientation, close operation.

		EventQueue.invokeLater(() -> {
		});
		setTitle("Welcome to Claim Air");
		setSize(new Dimension(250, 400));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createRegView() {

		JPanel panelA = new JPanel();
		getContentPane().add(panelA);
		userNameLabel = new JLabel("Create User Name");
		passwordLabel = new JLabel("Create Password");
		firstNameLabel = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");
		//dobLabel = new JLabel("Date of Birth");
		emailLabel = new JLabel("Email Address");
		userNameText = new JTextField();
		userNameText.setPreferredSize(new Dimension(200, 25));
		passwordText = new JTextField();
		passwordText.setPreferredSize(new Dimension(200, 25));
		firstNameText = new JTextField();
		firstNameText.setPreferredSize(new Dimension(200, 25));
		lastNameText = new JTextField();
		lastNameText.setPreferredSize(new Dimension(200, 25));
		emailText = new JTextField();
		emailText.setPreferredSize(new Dimension(200, 25));
		regSubmitButton = new JButton("SUBMIT");

		panelA.add(userNameLabel);
		panelA.add(userNameText);
		panelA.add(passwordLabel);
		panelA.add(passwordText);
		panelA.add(firstNameLabel);
		panelA.add(firstNameText);
		panelA.add(lastNameLabel);
		panelA.add(lastNameText);
		panelA.add(emailLabel);
		panelA.add(emailText);
		panelA.add(regSubmitButton);

		regSubmitButton.addActionListener(new RegButtonActionListener());
	}

	private class RegButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cu();


		}

		public void cu() {
			AirResvDAOImpl dao = new AirResvDAOImpl();			

			try {
				Connection conn = dao.getConnection();
				PreparedStatement statement = conn.prepareStatement("INSERT INTO customer(username, password, first_name, last_name, email) "
						+ "values (?,?,?,?,?)"
						,PreparedStatement.RETURN_GENERATED_KEYS); // omit id column

				statement.setString(1, userNameText.getText());
				statement.setString(2, passwordText.getText());
				statement.setString(3, firstNameText.getText());
				statement.setString(4, lastNameText.getText());
				statement.setString(5, emailText.getText());

				System.out.println(userNameText+" "+passwordText+" "+firstNameText+" "+ lastNameText+" "+ emailText);
				statement.executeUpdate();
				statement.closeOnCompletion();
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
