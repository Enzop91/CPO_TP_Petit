/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_petitenzo;

import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class TP1_manipNombresInt_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Veuillez entrer le premier entier : ");
        int premierEntier = scanner.nextInt();
        
        System.out.print("Veuillez entrer le second entier : ");
        int secondEntier = scanner.nextInt();
        
        System.out.println("Le premier entier saisi est : " + premierEntier);
        System.out.println("Le second entier saisi est : " + secondEntier);
        
        int somme = premierEntier + secondEntier;
        int difference = premierEntier - secondEntier;
        int produit = premierEntier * secondEntier;
        
        System.out.println("La somme des deux entiers est : " + somme);
        System.out.println("La difference entre les deux entiers est : " + difference);
        System.out.println("Le produit des deux entiers est : " + produit);
        
        if (secondEntier != 0) {  
            int quotient = premierEntier / secondEntier;
            int reste = premierEntier % secondEntier;
           
            System.out.println("Le quotient entier de la division de " + premierEntier + " par " + secondEntier + " est : " + quotient);
            System.out.println("Le reste de la division euclidienne de " + premierEntier + " par " + secondEntier + " est : " + reste);
        } else {
            System.out.println("La division par zéro n'est pas possible.");
        }
   
        scanner.close();
        
    }
}
        