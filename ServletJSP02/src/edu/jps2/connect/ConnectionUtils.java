package edu.jps2.connect;

import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnectionUtils {
 
  public static Connection getMyConnection() throws SQLException,
          ClassNotFoundException {


      return SQLServerConnUtils_JTDS.getSQLServerConnection();
  }
 
  public static void main(String[] args) throws SQLException,
          ClassNotFoundException {
 
      System.out.println("Get connection ... ");
 
    
      Connection conn = ConnectionUtils.getMyConnection();
 
      System.out.println("Get connection " + conn);
 
      System.out.println("Done!");
  }
 
}