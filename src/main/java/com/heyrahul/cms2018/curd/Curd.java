package com.heyrahul.cms2018.curd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.heyrahul.cms2018.dbase.Dbs;

public class Curd extends Dbs {

	Statement statement = getDbStatment();

	public static void main(String[] args) {

		Statement statement = Dbs.getDbStatment();

		if (statement != null) {

			try {
				ResultSet resultSet = statement.executeQuery("select * from students");
				while (resultSet.next()) {

					System.out.println("user_id =" + " " + resultSet.getString("id"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.print("unable to connected");
		}

	}

}
