/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import BaseDeDonnee.ConnectionBD;
import Entities.Annonce;
import Entities.Categorie;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author souma
 */
public class AnnonceServices {
      private Connection connection;
    private PreparedStatement ps;
   
    public AnnonceServices(){
       connection = (Connection) ConnectionBD.getInstance();}
    
  
    
    
    
    public static List<Annonce> afficherAnn()
    {
        List<Annonce> list =new ArrayList<>() ; 
        
        {
        try {
            String reqSelect="Select * From annonce ";
            java.sql.Statement ps = ConnectionBD.getInstance().getConnection().createStatement();
              ResultSet rs = ps.executeQuery(reqSelect);
              while (rs.next())
              {
                  Annonce a =new Annonce();
                  a.id= rs.getInt(1);
                  a.clientid=rs.getInt(2);
                  a.souscategorie_id=rs.getInt(3);
                  a.titre= rs.getString(4);
                  a.description= rs.getString(5);
                  a.etat=rs.getString(6);
                  a.dateDebut=rs.getDate(7);
                  a.dateFin=rs.getDate(8);
                  a.lieu=rs.getString(9);
                  list.add(a);
                  System.out.println(""+rs.getInt("id")
                          +"|"+rs.getInt("clientid")
                          +"|"+rs.getInt("souscategorie_id")
                          +"|"+rs.getString("titre")
                          +"|"+rs.getString("description")
                          +"|"+rs.getString("etat")
                          +"|"+rs.getDate("dateDebut")
                          +"|"+rs.getDate("dateFin")
                          +"|"+rs.getString("lieu"));
              }
        } catch (SQLException e) {
            System.out.println("non affiché");
        }
        } return list;
    }
     

 public static void SupprimerAnn(int id) {
        String requete = "delete from annonce where id=?";
        try {
          java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("annonce supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
     

 public static void AjouterAnn(Annonce annonce)
     {
        
        String requete = "insert into annonce (id,clientid,souscategorie_id,titre,description,etat,dateDebut,dateFin,lieu) values (?,?,?,?,?,?,?,?,?)";
        try {
            java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1,annonce.getId());
            ps.setInt(2,annonce.getClientid());
            ps.setInt(3,annonce.getSouscategorie_id());
            ps.setString(4,annonce.getTitre());
            ps.setString(5,annonce.getDescription());    
            ps.setString(6,annonce.getEtat()); 
            ps.setDate(7, (Date) annonce.getDateDebut());
            ps.setDate(8, (Date) annonce.getDateFin());
            ps.setString(9,annonce.getLieu());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CategorieServices.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }

}
