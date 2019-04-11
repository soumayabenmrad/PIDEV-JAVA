/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import BaseDeDonnee.ConnectionBD;
import Entities.Proposition;
import Entities.Souscategorie;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
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
public class PropositionServices {
    
      private Connection connection;
    private PreparedStatement ps;
   
    public PropositionServices(){
       connection = (Connection) ConnectionBD.getInstance();}
    
 public static List<Proposition> afficherPr()
    {
        List<Proposition> list =new ArrayList<>() ; 
        {
           try {
              
               String reqSelect="Select * From proposition ";
               java.sql.Statement ps = ConnectionBD.getInstance().getConnection().createStatement();
               ResultSet rs = ps.executeQuery(reqSelect);
             
               while (rs.next()){
                  Proposition pr =new Proposition();
                
                  pr.id= rs.getInt(1);
                  pr.clientid=rs.getInt(2);
                  pr.annonce_id=rs.getInt(3);
                  pr.profid=rs.getInt(4);
                  pr.description= rs.getString(5);
                  pr.prix=rs.getString(6);
                  
                 list.add(pr);
                  System.out.println(""+rs.getInt("id")
                          +"|"+rs.getInt("clientid")
                          +"|"+rs.getInt("annonce_id")
                          +"|"+rs.getInt("profid")
                          +"|"+rs.getString("description")
                          +"|"+rs.getString("prix")
                          );
              }
        } catch (SQLException e) {
            System.out.println("non affiché");
        }
        } return list;
    }
    
  public static void AjouterProp(Proposition proposition){
        
        String requete = "insert into Proposition (id, clientid, annonce_id ,profid, Description, prix ) values (?,?,?,?,?,?)";
       
        try {
            java.sql.PreparedStatement ps = ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1, proposition.getId());
            ps.setInt(2, proposition.getClientid());
            ps.setInt(3, proposition.getAnnonce_id());
            ps.setInt(4, proposition.getProfid());
            ps.setString(5, proposition.getDescription());
            ps.setString(6, proposition.getPrix());
            
           ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PropositionServices.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
}
