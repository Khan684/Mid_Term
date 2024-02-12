/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        double n= in.nextInt();
        double m= in.nextInt();
        
        System.out.println("Choose an operation:");
        for (Operation operation : Operation.values()) {
            System.out.println(operation);
        }
        String userInput = in.next();
        
        // Convert user input to Operation enum
        Operation operation = null;
        try {
            operation = Operation.valueOf(userInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation!");
            System.exit(1);
        }

        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}