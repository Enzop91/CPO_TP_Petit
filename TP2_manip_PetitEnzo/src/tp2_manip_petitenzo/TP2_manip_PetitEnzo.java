/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_petitenzo;

/**
 *
 * @author enzop
 */
public class TP2_manip_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette3.nbCalories += 100;
       
        Tartiflette temp = assiette1;  // Sauvegarde calories assiette1
        assiette1 = assiette2;      
        assiette2 = temp;

        System.out.println("Calories dans assiette 1 : " + assiette1.nbCalories);
        System.out.println("Calories dans assiette 2 : " + assiette2.nbCalories);
        System.out.println("Calories dans assiette 3 : " + assiette3.nbCalories);
       
       
       
       

        }
    }

