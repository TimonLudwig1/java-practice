import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        
        // ternary operator: ? = Return 1 of 2 values if a condition is true 

        // variable = (condition) ? ifTrue : ifFalse; 

        // we check a condition, then use a ?, like asking a question, "is this condition true?", if yes, we return a value, if not, we return something else 

            int score = 80;
            int number;

            // if(score >= 60){
            //     System.out.println("PASS");
            // }
            // else{
            //     System.out.println("FAIL");
            // }
            // // This works, but we can make it cleaner

            String passOrFail = (score >=60) ? "PASS" : "FAIL"; 
            System.out.println(passOrFail);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");

            number = scanner.nextInt();

            String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD"; 
            System.out.println(evenOrOdd);

            scanner.close();
    }
}
