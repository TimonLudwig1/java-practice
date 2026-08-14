import java.util.Arrays;

public class IntroArrays {
    public static void main(String[] args) {
        
        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *
        // syntax: data type[] name = {... , ... , ...}

        String[] fruits = {"apple", "bannana", "orange", "peach"};
        System.out.println(fruits); // when we try to print an array, we get a memory address. Arrays fall under the category of reference datatypes
        
        // each value within an array is known as an element - to access an element we have to indicate an index number 

        System.out.println(fruits[0]);

        // change an element:

        fruits[0] = "pineapple"; 
        // System.out.println(fruits[0]);

        // length of an array

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // print all the elements of an array: for loop: 

        for(int i = 0; i < fruits.length ; i++){
            System.out.println(fruits[i] + " ");
        }

        // enhanced for loop - cycle once for each element within an array (for each):

        for(String fruit : fruits){     // basically : for fruit in fruits (Python) 
            System.out.println(fruit);
        }

        // Sorting Arrays - import java.util.Arrays class

        Arrays.sort(fruits);    // arrange alphabetically 

        // fill all elements of an array with a value

        Arrays.fill(fruits, "pineapples");

    }
}
