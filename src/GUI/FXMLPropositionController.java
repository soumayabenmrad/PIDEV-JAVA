/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.Categorie;
import Entities.Proposition;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import services.CategorieServices;
import services.PropositionServices;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class FXMLPropositionController implements Initializable {
   
    @FXML
    private TableView<Proposition> table;

    @FXML
    private TableColumn<Proposition, Integer> idprop;

    @FXML
    private TableColumn<Proposition, Integer> clientid;

    @FXML
    private TableColumn<Proposition, Integer> annonceid;

    @FXML
    private TableColumn<Proposition, Integer> professionelid;

    @FXML
    private TableColumn<Proposition, String> description;

    @FXML
    private TableColumn<Proposition, String> prix;

    /**
     * Initializes the controller class.
     */
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      afficher();
        

    }   
    
    public void afficher(){
         PropositionServices svp = new PropositionServices();
        List<Proposition> listP = svp.afficherPr();
      
        table.setItems(FXCollections.observableArrayList(listP));
      
        idprop.setCellValueFactory(new PropertyValueFactory<>("id"));
        clientid.setCellValueFactory(new PropertyValueFactory<>("clientid"));
        annonceid.setCellValueFactory(new PropertyValueFactory<>("annonce_id"));
        professionelid.setCellValueFactory(new PropertyValueFactory<>("profid"));
        description.setCellValueFactory(new PropertyValueFactory<>("description"));
        prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
        
    }
    
    
    
    
    @FXML
     public void changeScreenButtonPushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //this line gets the stage information
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
}
