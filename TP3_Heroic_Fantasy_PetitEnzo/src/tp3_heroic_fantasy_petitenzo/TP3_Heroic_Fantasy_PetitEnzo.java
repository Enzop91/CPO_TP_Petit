/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_petitenzo;

import java.util.ArrayList;

/**
 *
 * @author enzop
 */
public class TP3_Heroic_Fantasy_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        System.out.println(excalibur);
        System.out.println(durandal);
        
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        System.out.println(chene);
        System.out.println(charme);
        
         ArrayList<Arme> armes = new ArrayList<>();
         armes.add(excalibur);
         armes.add(durandal);
         armes.add(chene);
         armes.add(charme);
         
         System.out.println("Caractéristiques des armes :");
         for (int i = 0; i < armes.size(); i++) {
         System.out.println(armes.get(i));
    }
}
}