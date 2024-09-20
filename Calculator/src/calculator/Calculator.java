
package calculator;

import java.util.Scanner;

/**
 *
 * @author enzop
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Please enter the operator:");
    System.out.println("1) add");
    System.out.println("2) substract");
    System.out.println("3) multiply");
    System.out.println("4) divide");
    System.out.println("5) modulo");
    
    Scanner scanner = new Scanner(System.in);
    int operateur = scanner.nextInt();
    System.out.println("You selected operator: " + operateur);}
    

    
    
    

