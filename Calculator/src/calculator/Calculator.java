
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        
        Scanner scanner = new Scanner(System.in);

        
        int operateur = scanner.nextInt();
        System.out.println("You selected operator: " + operateur);

        
        System.out.println("Please enter the first value:");
        double operande1 = scanner.nextDouble();
        
        
        System.out.println("Please enter the second value:");
        double operande2 = scanner.nextDouble();
        
        double resultat = 0;

        if (operateur == 1) resultat = operande1 + operande2;
        else if (operateur == 2) resultat = operande1 - operande2;
        else if (operateur == 3) resultat = operande1 * operande2;
        else if (operateur == 4 && operande2 != 0) resultat = operande1 / operande2;
        else if (operateur == 5 && operande2 != 0) resultat = operande1 % operande2;
        else {
            System.out.println("Error: Invalid operation or division by zero.");
            return;
        }

        System.out.println("Result: " + resultat);
    }
}

    

    
    
    

