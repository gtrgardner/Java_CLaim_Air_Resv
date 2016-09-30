package com.air_resv_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import com.air_resv.dao.*;

public class UserLogin extends JFrame {
	AirResvDAOImpl dao = new AirResvDAOImpl(); // import for database connection
	/**
	 * Login access frame
	 */
	private static final long serialVersionUID = 3508123371293450262L;
	private JButton buttonSubmit;
	private JLabel labelUser;
	private JLabel labelPassword;
	// private JLabel fail;
	private JTextField textUser;
	private JPasswordField textPassword;
	private String uName;
	private String uPass;
	
	
	
	public UserLogin() {
		
		EventQueue.invokeLater(() -> {
		});
		setTitle("Login");
		setSize(new Dimension(250, 200));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	// Create Login View
	public void createLoginView() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		getContentPane().add(panel);
		labelUser = new JLabel("Username");
		textUser = new JTextField();
		textPassword = new JPasswordField();
		textUser.setPreferredSize(new Dimension(200, 25));
		textPassword.setPreferredSize(new Dimension(200, 25));
		panel.add(labelUser);
		panel.add(textUser);
		labelPassword = new JLabel("Enter Password");
		panel.add(labelPassword);
		panel.add(textPassword);
		buttonSubmit = new JButton("SUBMIT");
		panel.add(buttonSubmit);
		buttonSubmit.addActionListener(new ButtonSubmitActionListener());
	}

	/*
	 * When the submit button is clicked a connection to the database is made to
	 * verify username and password.
	 */
	private class ButtonSubmitActionListener implements ActionListener {

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			String sql = null;
			ResultSet rs = null;
			try {
				Connection conn = dao.getConnection();
				sql = ("SELECT username, password FROM customer");
				PreparedStatement statement = conn.prepareStatement(sql);
				rs = statement.executeQuery();
				while (rs.next()) {
					uName = textUser.getText();
					uPass = textPassword.getText();

					if (uName.equals(rs.getString("username"))) {
						if (uPass.equals(rs.getString("password"))) {

							UserInterface ui = new UserInterface();
							ui.createInterfaceView();
							ui.setVisible(true);
							userLoginClose();

						}

					}
				}

				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		// Closes the Login Screen
		public void userLoginClose() {

			dispose();
		}

	}
}

/*
 * } else { JOptionPane.showMessageDialog(null, "Login Error"); break; } } else
 * { JOptionPane.showMessageDialog(null, "Login Error");
 */