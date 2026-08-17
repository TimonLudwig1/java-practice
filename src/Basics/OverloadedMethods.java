package Basics;
public class OverloadedMethods {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name, but have different parameters
        // signature = name + parameters

        // System.out.println(add(1, 2, 3));

        String pizza = bakePizza("Flatbread", "Mozarella", "Pepperoni"); 
        System.out.println(pizza);

    }
    // a methods name + its parameters give us a unique signiture 
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return cheese + " " + topping + " " + bread + " pizza";
    }
}
