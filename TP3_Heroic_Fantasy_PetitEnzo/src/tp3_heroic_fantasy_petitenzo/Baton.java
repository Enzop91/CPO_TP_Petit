/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_petitenzo;

/**
 *
 * @author enzop
 */
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age < 100 ? age : 99; // Assure que l'âge est inférieur à 100
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}

