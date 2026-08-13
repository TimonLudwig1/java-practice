import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess; 
        int attempts = 0; 
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);   // first number is inclusive, last one is exclusive

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a Number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("TOO LOW, try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH, try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);


        scanner.close();
    }
}
