package Basics;
public class Methods {
    public static void main(String[] args){

        // method = a block of reuable code that is executed when called
        // a method has to be written OUTSIDE the main method

        // String name = "Timon";
        // int age = 22; 

        // happyBirthday(name, age);

        double result = square(4);  // after the method ends, we "replace it" with whatever comes out
        System.out.println(result);

        double result2 = cube(3);
        System.out.println(result2);

        String fullName = getFullName("Olaf", "Scholz");
        System.out.println(fullName);

        int age = 21;

        if(ageCheck(age)){
            System.out.println("You may sign up");
        }else{
            System.out.println("You must be 18+ to sign up!");
        }

    }
    // Syntax: 
    // returntype name(){}  - here we are calling a method inside of a method that is static, so this method has to be static too 
    // methods outside the main method do not know any variables etc from the main method. We need to define parameters
    // void = we're not returning anything
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number){
        return number * number; 
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last; 
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }   
        else{
            return false; 
        }
        // return age >= 18; works as well 
    }
}