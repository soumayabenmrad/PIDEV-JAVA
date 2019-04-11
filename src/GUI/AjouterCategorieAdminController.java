/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.Categorie;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import services.CategorieServices;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class AjouterCategorieAdminController implements Initializable {

    
      @FXML
    private TextField titre;

    @FXML
    private TextField description;

    @FXML
    private Button btnvalide;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         btnvalide.setOnAction(event->{
        Categorie c = new Categorie(titre.getText(),description.getText());
        CategorieServices svr = new CategorieServices();
         svr.AjouterCat(c);
         });
         
         
     
                 }
    
     @FXML
    public void changeScreenButtonPushedcategorie(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLCategorie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
    
    
    
}

