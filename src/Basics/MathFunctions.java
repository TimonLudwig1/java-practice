package Basics;
public class MathFunctions {
    public static void main(String[] args){
        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        double result;

        result = Math.pow(2.7, 5);        // power function: a to the power of b. There is no ** in java like in python 

        result = Math.abs(-45);

        result = Math.sqrt(9);

        result = Math.round(3.14);  //rounds to the nearest int

        result = Math.ceil(3.14);        // Math.ceil always rounds up

        result = Math.floor(3.89);      // floor always rounds down

        result = Math.max(10, 209);

        result = Math.min(10, 289);

        System.out.println(result);
    }
}
