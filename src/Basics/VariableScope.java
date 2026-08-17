package Basics;
public class VariableScope {

    // a class variable is declared inside of a class, but not inside of a method

    static int x = 3; // CLASS - can be "seen" by methods inside the main method

    public static void main(String[] args) {
        
        // variable scope = where a variable can be accessed    - local and class

        //inside a method, if you declare a variable it has what is considered a "local scope"

        int x = 1;  // LOCAL - outside the curly braces, this variable isn't going to be recognized 

        System.out.println(x);  // java uses LOCAL variables first

        doSomething();
    }
    static void doSomething(){      // variables with the same name are allowed, as long as they are within methods
        int x = 2; //LOCAL

        System.out.println(x);
    }
}