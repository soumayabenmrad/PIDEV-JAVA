/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import BaseDeDonnee.ConnectionBD;
import Entities.Souscategorie;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author souma
 */
public class SousCategorieServices {
    
     private Connection connection;
    private PreparedStatement ps;
   
    public SousCategorieServices(){
       connection = (Connection) ConnectionBD.getInstance();}
    
    
    public static List<Souscategorie> afficherSc ()
    {
        List<Souscategorie> list =new ArrayList<>() ; 
        String reqSelect="Select * From Souscategorie ";
           try {
          java.sql.Statement ps = ConnectionBD.getInstance().getConnection().createStatement();
              ResultSet rs = ps.executeQuery(reqSelect);
              while (rs.next()){
                  Souscategorie sc =new Souscategorie();
                  sc.id= rs.getInt(1);
                  sc.titre= rs.getString(2);
               
                  list.add(sc);
                  System.out.println(""+rs.getInt("id")+"|"+rs.getString("titre"));
              }
        } catch (SQLException e) {
            System.out.println("non affiché");
        }
       return list;
    }
    
    
    
     public static void SupprimerScCat(int id) {
        String requete = "delete from souscategorie where id=?";
        try {
          java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("sous categorie supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
     
}
