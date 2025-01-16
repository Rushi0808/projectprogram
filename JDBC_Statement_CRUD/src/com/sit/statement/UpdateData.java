package com.sit.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) {
		try {
			// Load The Driver Class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish JDBC Connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_statement","root","0808");
			String sql5 ="update student set rollno=10,name='Shiv' where rollno=101";

		//Create SQl Statement Object
		Statement smt = con.createStatement();
		// submit sql query
		smt.executeUpdate(sql5);
		// close all resources
		con.close();
		smt.close();
		System.out.println("update data successfully");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}