/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

//import javax.persistence.CascadeType;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
/**
 *
 * @author souma
 */
public class Souscategorie {
    public int id;
    public String titre;
    public int idCategorie;
    
   // @ManyToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "idCategorie", referencedColumnName = "idCategorie", nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Souscategorie(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Souscategorie() {
    }

    @Override
    public String toString() {
        return "Souscategorie{" + "id=" + id + ", titre=" + titre + '}';
    }
    
    
    
}
