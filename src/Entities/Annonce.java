/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Date;

/**
 *
 * @author souma
 */
public class Annonce {
    public int id;
    public int clientid;
    public  int souscategorie_id;
    public String titre;
    public String description;
    public String etat;
    public Date dateDebut;
    public Date dateFin;
    public String lieu;
    

    public int getSouscategorie_id() {
        return souscategorie_id;
    }

    public void setSouscategorie_id(int souscategorie_id) {
        this.souscategorie_id = souscategorie_id;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public Annonce(int id, int clientid, int souscategorie_id, String titre, String description, String etat, Date dateDebut, Date dateFin, String lieu) {
        this.id = id;
        this.clientid = clientid;
        this.souscategorie_id = souscategorie_id;
        this.titre = titre;
        this.description = description;
        this.etat = etat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieu = lieu;
    }

   
    public Annonce() {
    }

    @Override
    public String toString() {
        return "Annonce{" + "id=" + id + ", clientid=" + clientid + ", souscategorie_id=" + souscategorie_id + ", titre=" + titre + ", description=" + description + ", etat=" + etat + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", lieu=" + lieu + '}';
    }

   
    
    
    
}
