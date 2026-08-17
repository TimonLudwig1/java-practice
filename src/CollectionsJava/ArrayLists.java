package CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        
        // ArrayList = A resizeable array that stores objects (autoboxing if you want to store primitives).
        //             Arrays are fixed in size, but ArrayLists can change.

        // ArrayList<datatype> name = new ArrayList<>(); - <> has something to do with generics 

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>(); 

        // .add() to add items to an ArrayList

        list.add(3); 
        list.add(1);
        list.add(2);

        System.out.println(list);

        fruits.add("Orange"); 
        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Coconut");   
        fruits.add("Blueberry");   
        fruits.add("Blackberry");   
        
        System.out.println(fruits);

        // .remove(index) to remove an element

        fruits.remove(0); 

        System.out.println(fruits);

        // .set(index) to set element at index to something else
        
        fruits.set(0, "Strawberry");

        System.out.println(fruits);

        // .get(index) to get an element at index 

        System.out.println(fruits.get(1));

        // .size() for total amount of elements

        System.out.println(fruits.size());

        // Sorting ArrayList - use the Collections framework

        Collections.sort(fruits); 
        System.out.println(fruits);

        // iterate through all objects: 

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // small practice: 

        Scanner scanner = new Scanner(System.in); 
        
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); //clear input buffer

        for(int i = 1; i <= numOfFood; i++){
            System.out.printf("Enter food number %d: ", i);
            String food = scanner.nextLine(); 
            foods.add(food); 
        }

        System.out.println(foods);

        scanner.close();
    }
}
