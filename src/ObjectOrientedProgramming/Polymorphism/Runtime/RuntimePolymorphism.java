package ObjectOrientedProgramming.Polymorphism.Runtime;

import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        
        // Runtime polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object 

        Animal animal; 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat(); 
            animal.speak();
        }
        else{
            System.out.println("Please pick a valid choice!");
        }

        scanner.close();
    }
    
}