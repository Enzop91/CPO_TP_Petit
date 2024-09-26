/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_petitenzo;

import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class TP1_convertisseur_PetitEnzo {

     public static double CelciusVersKelvin(double tCelsius) {
        // Conversion de Celsius vers Kelvin
        return tCelsius + 273.15;
    }
   
     public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; // Conversion de Kelvin vers Celsius
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9; // Conversion de Fahrenheit vers Celsius
    }

    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32; // Conversion de Celsius vers Fahrenheit
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        // Conversion : Kelvin -> Celsius -> Fahrenheit
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        // Conversion : Fahrenheit -> Celsius -> Kelvin
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeurReelle = scanner.nextDouble();
        System.out.println("La valeur réelle saisie est : " + valeurReelle);
        
        // Afficher le menu des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
        // Demander à l'utilisateur de choisir une option
        System.out.print("Entrez votre choix (1-6) : ");
        int choix = scanner.nextInt();

        double resultat = 0;

        // Effectuer la conversion en fonction du choix de l'utilisateur
        switch (choix) {
            case 1:
                System.out.print("Veuillez entrer la température en degrés Celsius : ");
                double tempCelsius = scanner.nextDouble();
                resultat = CelciusVersKelvin(tempCelsius);
                System.out.println(tempCelsius + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                System.out.print("Veuillez entrer la température en Kelvin : ");
                double tempKelvin = scanner.nextDouble();
                resultat = KelvinVersCelcius(tempKelvin);
                System.out.println(tempKelvin + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                System.out.print("Veuillez entrer la température en degrés Celsius : ");
                tempCelsius = scanner.nextDouble();
                resultat = CelciusVersFarenheit(tempCelsius);
                System.out.println(tempCelsius + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 4:
                System.out.print("Veuillez entrer la température en Fahrenheit : ");
                double tempFahrenheit = scanner.nextDouble();
                resultat = FarenheitVersCelcius(tempFahrenheit);
                System.out.println(tempFahrenheit + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
                break;
            case 5:
                System.out.print("Veuillez entrer la température en Kelvin : ");
                tempKelvin = scanner.nextDouble();
                resultat = KelvinVersFarenheit(tempKelvin);
                System.out.println(tempKelvin + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                System.out.print("Veuillez entrer la température en Fahrenheit : ");
                tempFahrenheit = scanner.nextDouble();
                resultat = FarenheitVersKelvin(tempFahrenheit);
                System.out.println(tempFahrenheit + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 6.");
        }
        
        scanner.close();
}
}
