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
    
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
        7.0f ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere autreBiere1 = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate");
        BouteilleBiere autreBiere2 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        BouteilleBiere autreBiere3 = new BouteilleBiere("Leffe Blonde",8.8f,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        autreBiere1.lireEtiquette();
        autreBiere2.lireEtiquette();
        autreBiere3.lireEtiquette();
        boolean resultat = autreBiere.Decapsuler();
        System.out.println("Décapsulage réussi : " + resultat);
        
        System.out.println(uneBiere);
        System.out.println(autreBiere);
    }
   
        
        
 }
