/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     
int nb;
int result; 
int ind; 

Scanner sc = new Scanner(System.in);
       System.out.println("\n Entrer le nombre :");
       nb=sc.nextInt(); 
       
result=0;

ind=1;
while (ind <= nb) {
result=result+ind;
ind+=1; 
}

System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
}
    }