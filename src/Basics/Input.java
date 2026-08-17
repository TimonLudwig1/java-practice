package Basics;
import java.util.Scanner;   //in java we need to import the Scanner object from utils for user imput

public class Input {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);                 // Scaner : name of the class we're working with; scanner: name of the object we're working with - lower case
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();     //with "nextLine", the user can input something. nextLine reads any String of characters including spaces. If we don't want any spaces, just use "next"

        // for other data types use different next… : 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello" + " " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("Your grade is " + grade);
        System.out.println("Student: " + isStudent);

        scanner.close(); //we should always close our scanner

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are not enrolled");
        }

        /* important: when we first accept an int and then a string after: the "enter" input gets taken as the input for the string. 
            to fix: we use the scanner.nextLine() method, without assigning it to anything:
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); -> here: nextLine without any assignement to fix the issue

            System.out.print("Enter your favorite color: ");
            String color = scanner.nextLine();

            System.out.println(…)
            System.out.println(…)

            scanner.close()
        */
    }
}
