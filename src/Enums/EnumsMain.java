package Enums;

import java.util.Scanner;

public class EnumsMain {
    public static void main(String[] args) {
        
        // Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings. 

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a new day of the week: ");
        String response = scanner.nextLine().toUpperCase(); 

        try {
            Day day = Day.valueOf(response); 

            // System.out.println(day);
            // System.out.println(day.getDayNumber());

            // MONDAAY, TUESDAY, ... are NOT STRINGS, so don't use "" - it is also faster than Strings!
            switch (day) {
                case MONDAY, 
                    TUESDAY, 
                    WEDNESDAY,
                    THURSDAY, 
                    FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY, PIZZADAY -> System.out.println("It is the weekend");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Enter a valid weekday");
        }
        scanner.close(); 
    }
}
