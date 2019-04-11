/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.Annonce;
import Entities.Categorie;
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
import services.AnnonceServices;
import services.CategorieServices;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class FXMLAnnonceController implements Initializable {
 @FXML
    private TableView<Annonce> tableAnnonce;

    @FXML
    private TableColumn<Annonce, String> id;

    @FXML
    private TableColumn<Annonce, String> clientid;
    
     @FXML
    private TableColumn<Annonce, String> souscategorieid;

    @FXML
    private TableColumn<Annonce, String> titre;

    @FXML
    private TableColumn<Annonce, String> description;

    @FXML
    private TableColumn<Annonce, String> etat;

    @FXML
    private TableColumn<Annonce, String> dated;

    @FXML
    private TableColumn<Annonce, String> datef;

    @FXML
    private TableColumn<Annonce, String> lieu;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AnnonceServices service_Annonce = new AnnonceServices();
        List<Annonce> listA = service_Annonce.afficherAnn();
       
        tableAnnonce.setItems(FXCollections.observableArrayList(listA));
       
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        clientid.setCellValueFactory(new PropertyValueFactory<>("clientid"));
        souscategorieid.setCellValueFactory(new PropertyValueFactory<>("souscategorie_id"));
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        description.setCellValueFactory(new PropertyValueFactory<>("description"));
        etat.setCellValueFactory(new PropertyValueFactory<>("etat"));
        dated.setCellValueFactory(new PropertyValueFactory<>("dateDebut"));
        datef.setCellValueFactory(new PropertyValueFactory<>("dateFin"));
        lieu.setCellValueFactory(new PropertyValueFactory<>("lieu"));
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
