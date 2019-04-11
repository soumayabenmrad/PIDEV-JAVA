/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


/**
 *
 * @author souma
 */
public class Categorie {
   public int idCategorie;
   public String titre;
   public String description;
   public String nom_image;
   
   
    public String getNom_image() {
        return nom_image;
    }

    public void setNom_image(String nom_image) {
        this.nom_image = nom_image;
    }

    public Categorie(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

   
    

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categorie(int id, String titre, String description, String nom_image) {
        this.idCategorie = id;
        this.titre = titre;
        this.description = description;
        this.nom_image = nom_image;
    }

    public Categorie(String titre, String description, String nom_image) {
        this.titre = titre;
        this.description = description;
        this.nom_image = nom_image;
    }
    

    public Categorie() {
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + idCategorie + ", titre=" + titre + ", description=" + description + ", image=" + nom_image + '}';
    }
   
   
}
