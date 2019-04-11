/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author souma
 */
public class ConnectionBD {
    public static ConnectionBD conn;
      String url="jdbc:mysql://127.0.0.1:3306/fixits";
      String userName="root";
      String password="";
      public Connection connection;
     
     public ConnectionBD(){
           try{
        this.connection=DriverManager.getConnection(url, userName, password);
        System.out.println("connexion etablie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     }
     
      public static ConnectionBD getInstance() 
    {
        if (conn==null)
                   conn = new ConnectionBD();
                return conn;
    }
     
      public Connection getConnection(){
         return connection;
     }
     
}
