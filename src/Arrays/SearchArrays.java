package Arrays;
public class SearchArrays {
    public static void main(String[] args) {
        
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        int target = 9;
        String targetFruit = "orange"; 
        boolean isFound = false; 
        boolean isFoundFruit = false; 

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.printf("Element %d found at index %d: \n", target, i);
                isFound = true; 
                break;
            }
        }

        if(!isFound){
            System.out.printf("Element %d not found in the array\n", target);
        }

        for(int i = 0; i < fruits.length; i++){
            if (targetFruit.equals(fruits[i])){
                System.out.printf("Fruit %s found at index %d: \n", targetFruit, i);
                isFoundFruit = true;
                break;
            }
        }

        if(!isFoundFruit){
            System.out.println("Fruit not found in the array");
        }

    }
}
