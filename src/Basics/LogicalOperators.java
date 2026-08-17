package Basics;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        
        // && = AND - both conditions have to be true 
        // || = OR  - one of the conditions needs to be true 
        // ! = NOT

        // double temp = -20;
        // boolean isSunny = true;

        // if(temp <= 30 && temp >= 0 && isSunny){
        //     System.out.println("The weather is good");
        //     System.out.println("It's sunny outside");
        // }
        // else if(temp <= 30 && temp >= 0 && !isSunny){
        //     System.out.println("The weather is good");
        //     System.out.println("It is cloudy outside");
        //     isSunny = false;
        // }
        // else if(temp > 30 || temp < 0){
        //     System.out.println("The weather is bad");
        // }

        Scanner scanner = new Scanner(System.in);

        String username; 

        System.out.print("Enter your username: ");
        username = scanner.nextLine();      // important: we need nextLine, not just next(), because next just reads to the first whitespace

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
    
}