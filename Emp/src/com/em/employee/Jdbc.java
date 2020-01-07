package com.em.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/test";
		String user = "student";		
		String pass = "student";
		
		Employee emp = new Employee("Frits", "Egters van", "0100200300", "frits@gmail.com", "HR", 15.00);
		
		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();
			myStmt.executeUpdate("insert into employee1 (last_name, first_name, phone_number, email, department, hourly_wage)"
					+ " value   ('"+emp.getLastName()+"', '"+emp.getFirstName()+"', '"+emp.getPhone_number()+"', "
							+ "	'"+emp.getEmail()+"', '"+emp.getDepartment()+"', '"+emp.getHourly_wage()+"')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}
}
