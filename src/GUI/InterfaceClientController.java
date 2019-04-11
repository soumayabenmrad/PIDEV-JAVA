/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class InterfaceClientController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
     public void changeScreenMesAnnoncePushed(ActionEvent event) throws IOException{ 
       Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLMesAnnonces.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
     
     
      public void changeScreenAjouterAnnoncePushed(ActionEvent event) throws IOException{ 
       Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLAjouterAnnonce.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
        
    }
}
