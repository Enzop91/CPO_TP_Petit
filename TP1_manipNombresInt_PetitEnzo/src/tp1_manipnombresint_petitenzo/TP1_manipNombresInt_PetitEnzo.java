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
        
        scanner.close();
    }
}
        