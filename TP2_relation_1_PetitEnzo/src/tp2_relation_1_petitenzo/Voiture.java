/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_petitenzo;

/**
 *
 * @author enzop
 */
public class Voiture {
    private String modele;
    private String marque;
    private int PuissanceCV;
    Personne proprietaire; // propriétaire

    // Constructor
    public Voiture(String modele, String marque, int PuissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null; // No owner yet
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // toString() method
    @Override
    public String toString() {
        return "la voiture : Modèle: " + modele + ", Marque: " + marque + ", PuissanceCV: " + PuissanceCV +
                ", Propriétaire: " + (proprietaire != null ? proprietaire.getNomComplet() : "Aucun") + "";
    }
}
