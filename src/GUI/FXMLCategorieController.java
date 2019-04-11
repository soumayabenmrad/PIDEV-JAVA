/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import Entities.Categorie;
import java.awt.Image;
import java.io.File;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import static jdk.nashorn.internal.runtime.Debug.id;



/**
 * FXML Controller class
 *
 * @author souma
 */
import services.CategorieServices;
public class FXMLCategorieController implements Initializable {

    @FXML
    private TextField chercherCategorie;

    @FXML
    private Button ajouterCat;
    @FXML
    private Button supprimebt;

    @FXML
    private Button modifierbt;

    @FXML
    private Button retour;

    @FXML
    private TableView<Categorie> table;

    @FXML
    private TableColumn<Categorie, String> id;

    @FXML
    private TableColumn<Categorie, String> titre;
  
    @FXML
    private TableColumn<Categorie, String> description;
   
    @FXML
    private TableColumn<Categorie, String> image;
 
     
    
    /**
     * Initializes the controller class.
     */
    
 
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        CategorieServices service_Categorie = new CategorieServices();
        List<Categorie> listC = service_Categorie.afficherC();
        table.setItems(FXCollections.observableArrayList(listC));
        id.setCellValueFactory(new PropertyValueFactory<>("idCategorie"));
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        description.setCellValueFactory(new PropertyValueFactory<>("description"));
        image.setCellValueFactory(new PropertyValueFactory<>("nom_image"));

                }    
                
    
    
    @FXML
    public void changeScreenButtonPushedAjoutercat(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("AjouterCategorieAdmin.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
    
            
            
    @FXML
    public void changeScreenButtonPushed(ActionEvent event) throws IOException{ 
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        
    }
    
}
