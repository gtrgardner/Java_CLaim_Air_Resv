package com.air_resv_interface;

import java.awt.*;
import javax.swing.*;

public class UserInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4688078365110371767L;
	private JButton makeRegButton;
	private JButton viewRegButton;
	private JButton cancelRegButton;
	public void UserFrame() {
		
		EventQueue.invokeLater(() -> {

		});

		setVisible(true);

	}

	public UserInterface() {

		this.setTitle("Claim Air Reservations");
		// this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth / 2, screenHeight / 2);
		this.setLocationRelativeTo(null);
		//	add(new ResvComponent());
		//	pack();
	}
	
	public void createInterfaceView(){
		JFrame userView = new JFrame();
		userView.setTitle("Claim Air Reservations");
	}
	/*	
class ResvComponent extends JComponent{

	private static final int Default_Width = 300;
	private static final int Default_Height = 200;
	public void paintComponent(Graphics g) {

		g.drawString("This is a sample", 75, 100);
	}

	public Dimension getPreferredSize(){

		return new Dimension(Default_Width, Default_Height);
	}

}
	 */


}
