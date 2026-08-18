package FileHandlingAndExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {
        
        // Exception = An event that interrupts the normal flow of a prgramm 
        //             Dividing by zero, file not found, mismatch input type) 
        //             Surround any dangerous code with a try{} block 
        //             try{}, catch{}, finally{}
        
        Scanner scanner = new Scanner(System.in); 

        // "try this dangerous code"
        try{
            System.out.print("Enter a number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter a second number: "); 
            double number2 = scanner.nextDouble();
            double result = number1 / number2;
            System.out.printf("result: %.2f\n", result);

        }
        catch(ArithmeticException e){            // if it can't be run, catch the error and do this     
            System.out.println("YOU CAN'T DIVIDE BY ZERO!!!");    // catch(*type of error* nickname){ do something } - you can add more than one catch block
        }   
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");    // Exception is a "last resort", usually you should always let the user know what went wrong 
        }
        finally{    //optional: this will always execute, no matter if an exception was raised or not - often used for cleanup
            scanner.close();
            System.out.println("This always executes");
        }

        // also possible: try with resources - put ressources into brackets - this is recommended 
         
        // try(Scanner scanner = new Scanner(System.in)){
        //     System.out.print("Enter a number: ");
        //     double number1 = scanner.nextDouble();
        //     System.out.print("Enter a second number: "); 
        //     double number2 = scanner.nextDouble();
        //     double result = number1 / number2;
        //     System.out.printf("result: %.2f\n", result);

        // }
        // catch(ArithmeticException e){            // if it can't be run, catch the error and do this     
        //     System.out.println("YOU CAN'T DIVIDE BY ZERO!!!");    // catch(*type of error* nickname){ do something } - you can add more than one catch block
        // }   
        // catch(InputMismatchException e){
        //     System.out.println("That wasn't a number!");
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong!");    // Exception is a "last resort", usually you should always let the user know what went wrong 
        // }
        // finally{    //optional: this will always execute, no matter if an exception was raised or not - often used for cleanup
        //     scanner.close();
        //     System.out.println("This always executes");
        // }
    }
}
