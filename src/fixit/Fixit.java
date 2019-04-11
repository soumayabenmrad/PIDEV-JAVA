/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixit;

import Entities.Annonce;
import Entities.Categorie;
import Entities.Proposition;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.io.IOException;
import java.sql.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import services.AnnonceServices;
import services.CategorieServices;
import services.PropositionServices;
import services.SousCategorieServices;
import services.UserServices;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author souma
 */
public class Fixit extends Application {
       
        private Stage stage;
    private static Fixit instance;
    private Scene scene;
    public Fixit() throws IOException, InterruptedException {
        instance = this;
       // scene = new Scene(FXMLLoader.load(getClass().getResource("/GUI/FXMLMenu.fxml")));
         scene = new Scene(FXMLLoader.load(getClass().getResource("/GUI/InterfaceClient.fxml")));

    }
     public static Fixit getInstance() {
        return instance;
    }
     
    public Stage getStage() {
        return stage;
    }
     @Override
    
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        stage.setScene(this.scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.centerOnScreen();
        stage.show();
    }
     public void changescene(Scene scene) {
        this.scene = scene;
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Categorie C1 = new Categorie(10,"bebe","hjcgv","hkdj");
       // Categorie C2 = new Categorie(10,"bebe","service pour les bebe","baby.png");
       // Proposition P1 = new Proposition(2,2,1,3,"je veux participer a votre annonce","25dt");
         //Annonce A1  = new Annonce(1,2,1,"mon bebe","je veux une personne","annuler","01/02/2014","02/03/2014","Tunis");
            //timestamp
        //SousCategorieServices.SupprimerScCat(2);
       // SousCategorieServices.afficherSc();
           // PropositionServices.AjouterProp(P1);
          //PropositionServices.afficherPr();
            //CategorieServices.AjouterCat(C1);
           //CategorieServices.SupprimerCat(10);
          // CategorieServices.afficherC();
       // AnnonceServices.afficherAnn();
      //AnnonceServices.SupprimerAnn();
       

       // a verifier CategorieServices.ModifierCat(C2);
      // a verifier CategorieServices.chercherCat("maison");
     // a verifier AnnonceServices.AjouterAnn(A1);
        launch(args);
    }
    
}
