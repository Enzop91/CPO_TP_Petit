/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_petitenzo;

import java.util.Random;
import java.util.Scanner;

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
       Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int nombreAleatoire = generateurAleat.nextInt(6);
            tab[nombreAleatoire]++;
        }

        System.out.println("Pourcentages des faces du dé après " + m + " tirages :");
        for (int i = 0; i < tab.length; i++) {
            double pourcentage = (tab[i] / (double) m) * 100;
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage);
        }

        scanner.close();
    }
}