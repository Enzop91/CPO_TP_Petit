/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_petitenzo;

/**
 *
 * @author enzop
 */
public class Convertisseur {
    // Attribut pour suivre le nombre de conversions effectuées
    private int nbConversions;

    // Constructeur
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode de conversion Celsius vers Kelvin
    public float CelsiusVersKelvin(float tCelsius) {
        nbConversions++;
        return tCelsius + 273.15f;
    }

    // Méthode de conversion Kelvin vers Celsius
    public float KelvinVersCelsius(float tKelvin) {
        nbConversions++;
        return tKelvin - 273.15f;
    }

    // Méthode de conversion Fahrenheit vers Celsius
    public float FahrenheitVersCelsius(float tFahrenheit) {
        nbConversions++;
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion Celsius vers Fahrenheit
    public float CelsiusVersFahrenheit(float tCelsius) {
        nbConversions++;
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode de conversion Kelvin vers Fahrenheit
    public float KelvinVersFahrenheit(float tKelvin) {
        float tCelsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFahrenheit(tCelsius);
    }

    // Méthode de conversion Fahrenheit vers Kelvin
    public float FahrenheitVersKelvin(float tFahrenheit) {
        float tCelsius = FahrenheitVersCelsius(tFahrenheit);
        return CelsiusVersKelvin(tCelsius);
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}
