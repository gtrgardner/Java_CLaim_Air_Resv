package com.air_resv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirResvDAOImpl {

	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception ex){

		}
	}

	public Connection getConnection()throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/"
				+ "airline?autoReconnect=true&useSSL=false",
				"robert", "robert");
	} 

	public void closeConnection(Connection conn) {

		if (conn == null) {
			return;
		}
		try {
			conn.close();
		} catch (SQLException ex) {

		}

	}

}




