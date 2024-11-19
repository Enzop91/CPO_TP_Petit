/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_petitenzo;

/**
 *
 * @author enzop
 */
public class TP2_Bieres_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Utilisation du constructeur
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();  // Affichage de l'étiquette de la première bière
       
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        uneSecondeBiere.lireEtiquette();
       
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");
        troisiemeBiere.lireEtiquette();  // Affichage de l'étiquette de la troisième bière
       
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Kwak", 8.4, "Brouwerij Bosteels");
        quatriemeBiere.lireEtiquette();  // Affichage de l'étiquette de la quatrième bière
       
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Hoegaarden", 4.9, "Brouwerij van Hoegaarden");
        cinquiemeBiere.lireEtiquette();
       
        uneBiere.Decapsuler();       // Décapsule première bière
        troisiemeBiere.Decapsuler();
       
        System.out.println(uneBiere);        // Affiche l'état de la première bière
        System.out.println(uneSecondeBiere);
        System.out.println(troisiemeBiere);  
        System.out.println(quatriemeBiere);  
        System.out.println(cinquiemeBiere);
    }
    }
