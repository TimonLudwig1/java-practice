package Arrays;

class TwoDArray {
    public static void main(String[] args) {
        
        // 2D array = An array where each element is an array
        //            useful for storing a matrix of data

        // String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        // two dimensional array: [][] - each element of this array is an array

        String[][] groceries = {{"apple", "orange", "banana"},  // we don't have to initialize every array, we can also pass one in while creating the 2D array
                                vegetables, 
                                meats}; 

        // display all items of all arrays: we need a nested loop. We would only get the memory addresses with a normal loop

        for(String[] foods : groceries){
            for(String item : foods){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        // replacing elements: - list two indices: [row][column]

        groceries[0][0] = "pineapple"; 
        groceries[1][0] = "carrot"; 
        groceries[0][2] = "blueberry"; 

        for(String[] foods : groceries){
            for(String item : foods){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        char[][] telephone = {{'1', '2', '3'}, 
                              {'4', '5', '6'},  
                              {'7', '8', '9'}, 
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}