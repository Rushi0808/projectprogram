package com.sit.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerClassInsertData {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/jdbc_statement";
        String user = "root";
        String password = "0808";

        Scanner scanner = new Scanner(System.in);

        // Try-with-resources to handle database connection and statement
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()
        ) {
            System.out.println("Database connected successfully!");

            // Get user input
            System.out.print("Enter rollno for column1: ");
            int rollno = scanner.nextInt();

            System.out.print("Enter name for column2: ");
            String name = scanner.next();

            System.out.print("Enter email for column3: ");
            String email = scanner.next();
            
            System.out.print("Enter add for column3: ");
            String adress = scanner.next();

            // Create the SQL INSERT query
            String sql = String.format(
                "INSERT INTO student (rollno, name, email,addr) VALUES ('%s', '%s', '%s','%s')",
                rollno, name, email,adress
            );
			String sql5 ="update student set rollno=10,name='Shiv' where rollno=101";
			


            // Execute the query
            int rowsInserted = statement.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
