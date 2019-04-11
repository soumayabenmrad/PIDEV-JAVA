/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BaseDeDonnee.ConnectionBD;
import Entities.Souscategorie;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import services.CategorieServices;


/**
 * FXML Controller class
 *
 * @author souma
 */
public class FXMLAjouterAnnonceController implements Initializable {

  

    @FXML
    private DatePicker datedebut;

    @FXML
    private DatePicker datefin;

    @FXML
    private TextField titre;

    @FXML
    private TextField description;

    @FXML
    private TextField lieu;
    
  
    @FXML
    private ComboBox<String> Combosouscategorie;

     ObservableList<String> list = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
      
        
    }    
    
    public void comboboxlist(ActionEvent event) throws SQLException{
        try {
         String query =" select titre from Souscategorie";
                 java.sql.Statement ps = ConnectionBD.getInstance().getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery(query);
              while (rs.next())
              {
                  String list = rs.getString("titre");
                  
              }
    } catch (SQLException ex) {
            Logger.getLogger(CategorieServices.class.getName()).log(Level.SEVERE, null, ex);
        }
         Combosouscategorie.setItems(list);
    }
    

}