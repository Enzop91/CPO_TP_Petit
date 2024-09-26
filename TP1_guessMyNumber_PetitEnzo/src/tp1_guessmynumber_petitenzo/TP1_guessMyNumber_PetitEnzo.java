/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_petitenzo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class TP1_guessMyNumber_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Random generateurAleat = new Random();
       System.out.println("Voici 5 nombres aleatoires :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
}
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.println("Choisissez votre niveau de difficulté : ");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        int choixDifficulte = scanner.nextInt();

       
        int nombreAleatoire = generateurAleat.nextInt(101); 
        int nombreMaxTentatives = 0;
        String messageAide = "";

        switch (choixDifficulte) {
            case 1: 
                nombreMaxTentatives = 10;
                messageAide = "Indice : Essayez de rester proche du nombre.";
                break;
            case 2:
                nombreMaxTentatives = 7;
                messageAide = "Indice : Soyez attentif aux différences.";
                break;
            case 3: 
                nombreMaxTentatives = 5;
                messageAide = "Indice : Vous avez moins de tentatives, concentrez-vous !";
                break;
            default:
                System.out.println("Choix de difficulté invalide, passage en mode Normal par défaut.");
                nombreMaxTentatives = 7;
                messageAide = "Indice : Soyez attentif aux différences.";
        }

        System.out.println(messageAide);
        System.out.println("Devinez un nombre entre 0 et 100 :");

        int nombreSaisi = -1; 
        int compteurTentatives = 0; 

       
        while (nombreSaisi != nombreAleatoire && compteurTentatives < nombreMaxTentatives) {
            System.out.print("Entrez votre nombre : ");
            nombreSaisi = scanner.nextInt(); 
            compteurTentatives++; 

          
            if (nombreSaisi < nombreAleatoire) {
                if (nombreAleatoire - nombreSaisi > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (nombreSaisi > nombreAleatoire) {
                if (nombreSaisi - nombreAleatoire > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné ! Le nombre était " + nombreAleatoire + ".");
                System.out.println("Nombre de tentatives : " + compteurTentatives);
            }
        }

        if (compteurTentatives >= nombreMaxTentatives) {
            System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre était " + nombreAleatoire + ".");
        }

        
        scanner.close();
    }
}
