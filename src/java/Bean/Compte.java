/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author macbookpro
 */
public class Compte {
    private int id;
    private String proprietaire;
    private float solde; 

    public Compte() {
    }

    public Compte(int id, String proprietaire, float solde) {
        this.id = id;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public float getSolde() {
        return solde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    
    
}
