/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_petitenzo;

/**
 *
 * @author enzop
 */
public class BouteilleBiere {
    String nom;            
    double degreAlcool;    
    String brasserie;      
    boolean ouverte;
   
    public BouteilleBiere() {
        this.nom = "Inconnue";
        this.degreAlcool = 0.0f;
        this.brasserie = "Inconnue";
        this.ouverte = false;
    }
   
    // Constructeur avec trois paramètres
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // bouteille fermée par défaut
    }
   
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;  // Ouvre la bouteille
            System.out.println("La bière " + nom + " est maintenant ouverte.");
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;
        }
    }
     @Override // écrase la méthode toString originelle
     public String toString() {
        String chaine;
        chaine = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine += "oui";
        } else {
            chaine += "non";
        }
        return chaine;
    }
    }