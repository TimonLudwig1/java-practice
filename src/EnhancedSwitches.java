import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){

        // Enhanced switch = A replacement to many else statements (Java 14 feature)

        String day;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");

        day = scanner.next();

        switch (day) {                                                                                                  // pass the variable you want to examine 
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");     // -> means: do this code,                                
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");                                   // enter all conditions with a ","

            
            default -> System.out.println("Please enter a valid weekday, " + day + " is not a valid day");  // defalut behaves similar to an else 
        }
        scanner.close();
    }
}
