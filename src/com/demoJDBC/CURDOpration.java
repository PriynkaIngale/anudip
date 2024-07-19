package com.demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

interface CRUDOperations 
{
    void create(String firstName, String lastName, int age) throws SQLException;
    void read() throws SQLException;
    void update(int id, String firstName, String lastName, int age) throws SQLException;
    void delete(int id) throws SQLException;
}


class JDBCCrudOperations implements CRUDOperations 
{
    private Connection connection;
    private java.sql.Statement statement;
    private ResultSet resultSet;

    public JDBCCrudOperations() throws SQLException
    {
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");
    }

    @Override
    public void create(String firstName, String lastName, int age) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "INSERT INTO users (first_name, last_name, age) VALUES ('" + firstName + "', '" + lastName + "', " + age + ")";
        statement.executeUpdate(sql);
        System.out.println("Data inserted successfully!");
    }

    @Override
    public void read() throws SQLException 
    {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()) 
        {
            System.out.println(resultSet.getInt("id") + ", "+ resultSet.getString("first_name") + ", "+ resultSet.getString("last_name") + ", "+ resultSet.getInt("age"));
        }
    }

    @Override
    public void update(int id, String firstName, String lastName, int age) throws SQLException 
    {
        statement = connection.createStatement();
        String sql = "UPDATE users SET first_name='" + firstName + "', last_name='" + lastName + "', age=" + age + " WHERE id=" + id;
        statement.executeUpdate(sql);
        System.out.println("Data updated successfully!");
    }

    @Override
    public void delete(int id) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "DELETE FROM users WHERE id=" + id;
        statement.executeUpdate(sql);
        System.out.println("Data deleted successfully!");
    }

    // Close connection
    public void closeConnection() throws SQLException
    {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}

public class CURDOpration 
{
	public static void main(String[] args) 
	{
		 try {
	            JDBCCrudOperations jdbcCrud = new JDBCCrudOperations();

	            Scanner xyz = new Scanner(System.in);
	            System.out.println("Select operation:");
	            System.out.println("1. Create");
	            System.out.println("2. Read");
	            System.out.println("3. Update");
	            System.out.println("4. Delete");
	            System.out.print("Enter your choice: ");
	            int operation = xyz.nextInt();

	            switch (operation) 
	            {
	                case 1:
	                    System.out.print("Enter first name: ");
	                    String firstName = xyz.next();
	                    System.out.print("Enter last name: ");
	                    String lastName = xyz.next();
	                    System.out.print("Enter age: ");
	                    int age = xyz.nextInt();
	                    jdbcCrud.create(firstName, lastName, age);
	                    break;
	                case 2:
	                    jdbcCrud.read();
	                    break;
	                case 3:
	                    System.out.print("Enter user id to update: ");
	                    int updateId = xyz.nextInt();
	                    System.out.print("Enter updated first name: ");
	                    String updatedFirstName = xyz.next();
	                    System.out.print("Enter updated last name: ");
	                    String updatedLastName = xyz.next();
	                    System.out.print("Enter updated age: ");
	                    int updatedAge = xyz.nextInt();
	                    jdbcCrud.update(updateId, updatedFirstName, updatedLastName, updatedAge);
	                    break;
	                case 4:
	                    
	                    System.out.print("Enter user id to delete: ");
	                    int deleteId = xyz.nextInt();
	                    jdbcCrud.delete(deleteId);
	                    break;
	                default:
	                    System.out.println("Invalid operation!");
	            }

	            jdbcCrud.closeConnection();
	        }
		    catch (SQLException e) 
		    {
	            e.printStackTrace();
	        }
		

	}

}
