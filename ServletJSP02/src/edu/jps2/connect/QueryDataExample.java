package edu.jps2.connect;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class QueryDataExample {
 
  public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
 
      Connection connection = ConnectionUtils.getMyConnection();
 
      Statement statement = connection.createStatement();
 
      String sql = "Select * from Users ";
 
    
      ResultSet rs = statement.executeQuery(sql);
 
      
      while (rs.next()) {
    	  int role = rs.getInt("Role");
          String Name = rs.getString("UserName");
          String pass = rs.getString("Passwords");
          
         
          System.out.println("--------------------");
          System.out.println("Username:" + Name);
          System.out.println("Pass:" + pass);
          System.out.println("Role: " + role);
        
          
 
      }
      
      connection.close();
  }
 
}