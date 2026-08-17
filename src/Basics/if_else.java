package Basics;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        
        Scanner scanner  = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("What is your age?: ");
        age = scanner.nextInt();

        scanner.nextLine(); //same problem as in "Input.java", if we first input an int and then String after, the enter gets taken as the String input, so fix! 

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Are you a student (true/false) ");
        isStudent = scanner.nextBoolean();


        //Group 1: name

        if (name.isEmpty()) {   //.isEmpty() gives a bool if name is empty or not
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name);
        }

        //Group 2: age

        if(age >= 18){
            System.out.println("You are an adult");     //first if: first condition we check
        }
        else if (age >= 65) {
            System.out.println("You are a senior!");
        }
        else if(age < 0){
            System.out.println("you haven't been born yet");        //another condition we check
        }
        else if(age == 0){
            System.out.println("you are a baby");
        }
        else{
            System.out.println("You are a child!");     //else is always the default if no condition is met
        }

        //Group 3: isStudent

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
    
}
