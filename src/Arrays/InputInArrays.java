package Arrays;
import java.util.Scanner;

public class InputInArrays {
    public static void main(String[] args){

        // before assigning values into an array, we have allocate space for the array - define the size

        Scanner scanner = new Scanner(System.in); 

        // array as variable - no size decleration yet: 

        String[] foods;
        int size; 
        
        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine(); // int buffer

        foods = new String[size];       // size in brackets
        System.out.printf("Size of the array %d - you may enter %d foods:\n", size, size);

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine(); 
        }

        // foods[0] = "pizza";
        // foods[1] = "burger";
        // foods[2] = "taco";
        
        // for(String food : foods){
        //     System.out.println(food);
        // }
        scanner.close();
    }
}
