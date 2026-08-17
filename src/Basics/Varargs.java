package Basics;
public class Varargs {
    public static void main(String[] args) {
        
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods 
        //           java will pack the arguments into an array
        //           ... (ellipsis)
        System.out.println(add(1, 2, 3));
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
    }
    static int add(int... numbers){     // java compiler puts all those arguments into an array when we send them to a method
        
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum; 
    }

    static double average(double... numbers){

        double sum = 0;
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length; 
    }

}
