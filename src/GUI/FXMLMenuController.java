/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class FXMLMenuController implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Home;

    @FXML
    private Button users;

    @FXML
    private Button categorie;

    @FXML
    private Button souscategorie;

    @FXML
    private Button annonce;

    @FXML
    private Button proposition;

    @FXML
    private Button statistique;

   
    /**
     * Initializes the controller class.
     * @param url
     */
   
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
    public void changeScreenCategoriePushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLCategorie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //this line gets the stage information
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
    
    public void changeScreenSousCategoriePushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLSouscategorie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //this line gets the stage information
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
     @FXML
    public void changeScreenStatPushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLStatistique.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //this line gets the stage information
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }

     public void changeScreenAnnoncePushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLAnnonce.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //this line gets the stage information
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
     
     
      public void changeScreenPropositionPushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLProposition.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }

    
}
