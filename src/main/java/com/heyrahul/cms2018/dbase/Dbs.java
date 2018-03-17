package com.heyrahul.cms2018.dbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.heyrahul.cms2018.model.User;

public class Dbs {

	private static final String url = "jdbc:mysql://localhost/cms2018";
	private static final String user = "root";
	private static final String password = "";

	public static Statement getDbStatment() {
		// creates three different Connection objects
		Statement statement = null;
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {

				statement = connection.createStatement();

			}

		} catch (SQLException ex) {

			ex.printStackTrace();
		}
		return statement;

	}

	public static void main(String[] args) {

		Statement statement = Dbs.getDbStatment();

		if (statement != null) {
			System.out.println("connected");
		} else {
			System.out.print("unable to connected");
		}

	}

	public User getUSer(int user_id) {
		User user = new User();
		user.setUser_id(13);
		user.setUser_email("heyrahul@gmail.com");
		user.setUser_name("Rahul Kumar");
		return user;

	}

}
