package com.sit.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) {

	try {
		// Load The Driver Class 
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish JDBC Connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_statement","root","0808");
		//Create Sql Query
		//String sql ="insert into student (rollno,name,email,addr) values (101,'ak','ak@gmail.com','pune')";
		//String sql2 ="insert into student (rollno,name,email,addr) values (102,'raj','raj@gmail.com','jalna')";
		//String sql3 ="insert into student (rollno,name,email,addr) values (103,'rushi','rushi@gmail.com','Ambad')";
		//String sql4 ="insert into student (rollno,name,email,addr) values (104,'om','om@gmail.com','Dubai')";
		String sql5 ="insert into student (rollno,name,email,addr) values (105,'nitin','nitin@gmail.com','jalna')";

		
		
		//Create SQl Statement Object
		Statement smt = con.createStatement();
		// submit sql query
		smt.execute(sql5);
		// close all resources
		con.close();
		smt.close();
		System.out.println("Save Data");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
