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
    float degreAlcool;
    String brasserie;
    boolean ouverte;        

public BouteilleBiere(String unNom, float unDegre, String
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }
 
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;
        }
    }
    @Override
     public String toString() {
        return "Nom : " + nom + "\n" +
               "Degré d'alcool : " + degreAlcool + "%\n" +
               "Brasserie : " + brasserie + "\n" +
               "Ouverte : " + (ouverte ? "Oui" : "Non");
    }

}

