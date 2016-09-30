package com.air_resv.main;

import com.air_resv_interface.UserStart;

import java.awt.EventQueue;

public class AirResvMain{

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
		@Override
		public void run(){
			UserStart us = new UserStart();
			 us.createStartView();
			 us.setResizable(false);
			 us.setVisible(true);
			}
		});
		
		
	}

}
