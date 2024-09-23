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
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Veuillez entrer une valeur reelle (type double) : ");
        double valeurReelle = scanner.nextDouble();
         
        System.out.println("La valeur reelle saisie est : " + valeurReelle);
       
        System.out.print("Veuillez entrer une temperature en degres Celsius : ");
        double temperatureCelsius = scanner.nextDouble();
        
        System.out.println("La temperature en degres Celsius est : " + temperatureCelsius);
          
        double temperatureKelvin = temperatureCelsius + 273.15;
        
        System.out.println("La temperature en degres Kelvin est : " + temperatureKelvin);
        
        scanner.close();
}
}
