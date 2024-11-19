/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_petitenzo;

import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class TP2_convertisseurObjet_PetitEnzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur convertisseur1 = new Convertisseur();
        System.out.print("Veuillez entrer une température pour le premier convertisseur : ");
        float temperature1 = sc.nextFloat();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix1 = sc.nextInt();
        float resultat1 = 0;

        switch (choix1) {
            case 1:
                resultat1 = convertisseur1.CelsiusVersKelvin(temperature1);
                System.out.println(temperature1 + " degrés Celsius est égal à " + resultat1 + " degrés Kelvin");
                break;
            case 2:
                resultat1 = convertisseur1.KelvinVersCelsius(temperature1);
                System.out.println(temperature1 + " degrés Kelvin est égal à " + resultat1 + " degrés Celsius");
                break;
            case 3:
                resultat1 = convertisseur1.FahrenheitVersCelsius(temperature1);
                System.out.println(temperature1 + " degrés Fahrenheit est égal à " + resultat1 + " degrés Celsius");
                break;
            case 4:
                resultat1 = convertisseur1.CelsiusVersFahrenheit(temperature1);
                System.out.println(temperature1 + " degrés Celsius est égal à " + resultat1 + " degrés Fahrenheit");
                break;
            case 5:
                resultat1 = convertisseur1.KelvinVersFahrenheit(temperature1);
                System.out.println(temperature1 + " degrés Kelvin est égal à " + resultat1 + " degrés Fahrenheit");
                break;
            case 6:
                resultat1 = convertisseur1.FahrenheitVersKelvin(temperature1);
                System.out.println(temperature1 + " degrés Fahrenheit est égal à " + resultat1 + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Veuillez saisir une valeur entre 1 et 6.");
        }

        Convertisseur convertisseur2 = new Convertisseur();
        System.out.print("Veuillez entrer une température pour le deuxième convertisseur : ");
        float temperature2 = sc.nextFloat();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix2 = sc.nextInt();
        float resultat2 = 0;

        switch (choix2) {
            case 1:
                resultat2 = convertisseur2.CelsiusVersKelvin(temperature2);
                System.out.println(temperature2 + " degrés Celsius est égal à " + resultat2 + " degrés Kelvin");
                break;
            case 2:
                resultat2 = convertisseur2.KelvinVersCelsius(temperature2);
                System.out.println(temperature2 + " degrés Kelvin est égal à " + resultat2 + " degrés Celsius");
                break;
            case 3:
                resultat2 = convertisseur2.FahrenheitVersCelsius(temperature2);
                System.out.println(temperature2 + " degrés Fahrenheit est égal à " + resultat2 + " degrés Celsius");
                break;
            case 4:
                resultat2 = convertisseur2.CelsiusVersFahrenheit(temperature2);
                System.out.println(temperature2 + " degrés Celsius est égal à " + resultat2 + " degrés Fahrenheit");
                break;
            case 5:
                resultat2 = convertisseur2.KelvinVersFahrenheit(temperature2);
                System.out.println(temperature2 + " degrés Kelvin est égal à " + resultat2 + " degrés Fahrenheit");
                break;
            case 6:
                resultat2 = convertisseur2.FahrenheitVersKelvin(temperature2);
                System.out.println(temperature2 + " degrés Fahrenheit est égal à " + resultat2 + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Veuillez saisir une valeur entre 1 et 6.");
        }

        // Affichage du nombre de conversions effectuées par chaque convertisseur
        System.out.println("Nombre de conversions effectuées par le premier convertisseur : " + convertisseur1);
        System.out.println("Nombre de conversions effectuées par le deuxième convertisseur : " + convertisseur2);
    }
}