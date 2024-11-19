/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_petitenzo;

/**
 *
 * @author enzop
 */
public class Personne {
    private String nom;
    private String prenom;
    Voiture[] liste_voitures; // 3 voitures MAX
    int nbVoitures; // Nombre de voiture possédée

    // Constructor
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3];
        this.nbVoitures = 0;
        liste_voitures = new Voiture [3] ; // réserve la mémoire du tableau
    }
    // ajoute une voiture à une personne
    public boolean ajouterVoiture(Voiture voiture) {
        if (nbVoitures < 3) {
            liste_voitures[nbVoitures] = voiture;
            voiture.setProprietaire(this); // assigner propriétaire de la voiture
            nbVoitures++;
            return true;
        } else {
            System.out.println("Impossible d'ajouter plus de 3 voitures.");
            return false;
        }
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    // toString() method
    @Override
    public String toString() {
        String result = "Personne [Nom: " + nom + ", Prénom: " + prenom + ", Voitures: ";
        for (int i = 0; i < nbVoitures; i++) {
            result += liste_voitures[i].toString() + " ";
        }
        return result + "]";
    }
   
}

