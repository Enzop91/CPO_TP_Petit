/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_petitenzo;

/**
 *
 * @author enzop
 */
public class Moussaka {
    int nbCalories;

    public Moussaka(int nbCalories) {
        this.nbCalories = nbCalories;
   
    Moussaka[] tabMoussaka = new Moussaka[10];
   
        tabMoussaka[0] = new Moussaka(500);
        tabMoussaka[1] = new Moussaka(600);
        tabMoussaka[2] = new Moussaka(700);
        tabMoussaka[3] = new Moussaka(800);
        tabMoussaka[4] = new Moussaka(900);
        tabMoussaka[5] = new Moussaka(1000);
        tabMoussaka[6] = new Moussaka(1100);
        tabMoussaka[7] = new Moussaka(1200);
        tabMoussaka[8] = new Moussaka(1300);
        tabMoussaka[9] = new Moussaka(1400);
       
        tabMoussaka[0] = afficherCalories();
        tabMoussaka[1] = afficherCalories();
        tabMoussaka[2] = afficherCalories();
        tabMoussaka[3] = afficherCalories();
        tabMoussaka[4] = afficherCalories();
        tabMoussaka[5] = afficherCalories();
        tabMoussaka[6] = afficherCalories();
        tabMoussaka[7] = afficherCalories();
        tabMoussaka[8] = afficherCalories();
        tabMoussaka[9] = afficherCalories();
    }

    private Moussaka afficherCalories() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
