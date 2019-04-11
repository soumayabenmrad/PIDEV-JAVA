/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import BaseDeDonnee.ConnectionBD;
import Entities.Categorie;
import Entities.Proposition;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author souma
 */
public class CategorieServices {
    
    
    
   
   
    
  private Connection connection;
    private PreparedStatement ps;

public static List<Categorie> afficherC()
    {
      List<Categorie> list =new ArrayList<>() ; 
       
        {
         try {
             String reqSelect="Select * From Categorie ";
             java.sql.Statement ps = ConnectionBD.getInstance().getConnection().createStatement();
             ResultSet rs = ps.executeQuery(reqSelect);
              while (rs.next())
              {
                  Categorie p = new Categorie();
                  p.idCategorie= rs.getInt(1);
                  p.titre= rs.getString(2);
                  p.description= rs.getString(3);
                  p.nom_image= rs.getString(4);
                  
                  list.add(p);
                  System.out.println(""+rs.getInt("id")
                          +"|"+rs.getString("titre")
                          +"|"+rs.getString("description")
                          +"|"+rs.getString("nom_image"));
              }
        } catch (SQLException e) {
            System.out.println("non affiché");
        }
      } return list;
    }
    
    
    
    
     public static void AjouterCat(Categorie categorie)
     {
        
        String requete = "insert into categorie (id,titre,description,nom_image) values (?,?,?,?)";
       
        try {
            java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
              
            ps.setInt(1,categorie.getIdCategorie());
            ps.setString(2,categorie.getTitre());
            ps.setString(3,categorie.getDescription());    
            ps.setString(4,categorie.getNom_image()); 
            ps.executeUpdate();
         } catch (SQLException ex) {
            Logger.getLogger(CategorieServices.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
     
     
       public static void SupprimerCat(int id) {
        String requete = "delete from categorie where id=?";
        try {
          java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("categorie supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
     
     
     public static void ModifierCat(Categorie categorie) {
        System.out.println(categorie);
        String req = "update categorie set titre=?,description=?,nom_image=? where id=?" ;
        try {
          java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(req);
          
            ps.setString(1, categorie.getTitre());
            ps.setString(2, categorie.getDescription());
            ps.setString(3, categorie.getNom_image());
            
            ps.executeUpdate();    
        } catch (SQLException e) {
        }
     }
     
     
       public static Categorie chercherCat(String titre)
    {
        Categorie categorie = new Categorie();
   
     String req="SELECT * from categorie where titre=?" ;
        try { 
            
             
            java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(req);
            
            ps.setString(1,titre);
            
            ResultSet rs =ps.executeQuery(req);
            
            categorie.idCategorie= rs.getInt(1);
            categorie.titre = rs.getString(2);
            categorie.description = rs.getString(3);
            categorie.nom_image = rs.getString(4);
            
            
            
        } catch (SQLException e) {
          e.printStackTrace();
            e.getMessage();
            e.getCause();
        }
        
        return categorie ;
    
      }
     
     
     
}
