/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_petitenzo;

/**
 *
 * @author enzop
 */
public class TP1_stats_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] tab = new int[6]; 

      
        System.out.println("Valeurs du tableau représentant les faces d'un dé :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + tab[i]);
        }
    }
}