import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

        // while loop = repeat some code forever, while some condition remains true 

        Scanner scanner = new Scanner(System.in);

        // String response = "";
        int age = 0;

        // while(!response.equals("Q")){
        //     System.out.println("You are playing a game");
        //     System.out.println("Press Q to quit");
        //     response = scanner.next().toUpperCase();
        // }
        
        // System.out.println("You have quit the game!");

        // we can also do a do while loop - do some code first and then check the condition, with a do while code we always enter the code 

        do{
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age<0);

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
