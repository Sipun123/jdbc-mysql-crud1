package com.java.mysql;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class GetAllRecordUsingJDBCPreparedStatement {
 
    public static void main(String[] args) {
 
        // variables
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        // Step 1: Loading or registering MySQL JDBC driver class
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading MySQL JDBC driver");
            cnfex.printStackTrace();
        }
 
        // Step 2: Opening database connection
        try {
 
            // Step 2.A: Create and get connection using DriverManager
            connection = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/hrdb", "root", ""); 
 
            // create SQL query to fetch all player records
            String sqlSelectQuery = "SELECT * FROM tbl_employee";
 
            // Step 2.B: Creating JDBC Statement 
        preparedStatement = connection.prepareStatement(sqlSelectQuery);
 
            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = preparedStatement.executeQuery();
 
            System.out.println("id\tname\t\t\tcity\tsalary");
            System.out.println("==\t================\t===\t=======");
 
            // processing returned data and printing into console
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" + 
                        resultSet.getString(2) + "\t" + 
                        resultSet.getString(3) + "\t" +
                        resultSet.getDouble(4));
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
 
            // Step 3: Closing database connection
            try {
                if(null != connection) {
 
                    // cleanup resources, once after processing
                    resultSet.close();
                    preparedStatement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
}