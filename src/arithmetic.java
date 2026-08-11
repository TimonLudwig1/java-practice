public class arithmetic {
    public static void main(String[] args) {

        // int x = 10;
        // int y = 2;

        // int z;

        // z = x + y; 
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = % x / y; modolus
       // no standard ** operation for powers like in python. You'd have to use Math.pow(num1, num2)
    
       // Augmented Assignement Operators: reassigning result to x:

        // x = x + y; -> this would technically work, but it works faster

        // x += y;
        // x -= y;
        // x *= y;
        // x /=  y;

        // Increment and Decrement Operators

        int x = 1;

        x++; 
        x++; //this is "incrementing x" , so adding +1 increment, you see this often in looping 

        x--;
        x--; //this is decrementing

        // in Python: x += 1 or x -= 1 

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        /*
        Parantheses
        Exponents
        Multiplication
        Division
        Addition
        Substraction 

        "Please excuse my dope ass swag" 
        */

        double result = 3 + 4 * (7-5) / 2.0; 

        System.out.println(result);
        System.out.println(x);
    }
    
}
