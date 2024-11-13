/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_petitenzo;

/**
 *
 * @author enzop
 */
public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse < 100 ? finesse : 99; // Assure que la finesse est inférieure à 100
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}

