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
public class Proposition {
    public int id;
    public int clientid;
    public int annonce_id;
    public int profid;
    public String description;
    public String prix;

    public Proposition(int id, int clientid, int annonce_id, int profid, String description, String prix) {
        this.id = id;
        this.clientid = clientid;
        this.annonce_id = annonce_id;
        this.profid = profid;
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Proposition{" + "id=" + id + ", clientid=" + clientid + ", annonce_id=" + annonce_id + ", profid=" + profid + ", description=" + description + ", prix=" + prix + '}';
    }
    
    
    

    public int getProfid() {
        return profid;
    }

    public void setProfid(int profid) {
        this.profid = profid;
    }

    public int getAnnonce_id() {
        return annonce_id;
    }

    public void setAnnonce_id(int annonce_id) {
        this.annonce_id = annonce_id;
    }

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

   

    public Proposition() {
    }

    

    
    
  
    
    
}
