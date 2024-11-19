/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_petitenzo;

/**
 *
 * @author enzop
 */
public class TP2_relation_1_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Voiture uneClio = new Voiture ("Clio", "Renault", 90) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles \n"+ uneClio  +
        "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ;
       
        Personne Bob = new Personne("Lennon", "Bob");
        Bob.liste_voitures[0] = uneClio;
        Bob.nbVoitures = 1; // Mise à jour du nombre de voitures possédées
        uneClio.setProprietaire(Bob);
        Bob.liste_voitures[bob.nbVoitures] = une2008;
        une2008.setProprietaire(Bob); // Définir Bob comme propriétaire de la 2008
        Bob.nbVoitures++;
       
        Personne Reno = new Personne("Jackson", "Reno");
        Reno.liste_voitures[0] = uneMicra;
        Reno.nbVoitures = 1;
        uneMicra.setProprietaire(Reno);
        Reno.liste_voitures[Reno.nbVoitures] = uneAutreClio;
        uneAutreClio.setProprietaire(Reno);
        Reno.nbVoitures++;
       
        System.out.println("Les voitures de Bob sont : " + Bob.liste_voitures[0] + " et " + Bob.liste_voitures[1]);

        // Afficher les voitures de Reno
        System.out.println("Les voitures de Reno sont : " + Reno.liste_voitures[0] + " \n et " + Reno.liste_voitures[1]);
}
 
}

