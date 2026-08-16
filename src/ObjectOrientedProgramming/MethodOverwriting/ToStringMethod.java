package ObjectOrientedProgramming.MethodOverwriting;

public class ToStringMethod {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overwridden to preovide meaningful details.

        Car car1= new Car("Audi", "a5", 2025, "white");
        Car car2= new Car("Mercedes", "C180", 2025, "black");

        System.out.println(car1);
        System.out.println(car2);
    }
}
