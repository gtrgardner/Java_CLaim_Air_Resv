package com.air_resv.main;

import com.air_resv_interface.UserStart;

import javax.swing.*;

public class AirResvMain{

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
		@Override
		public void run(){
			UserStart us = new UserStart();
			 us.createStartView();
			 us.setVisible(true);
			}
		});
		
		
	}

}
