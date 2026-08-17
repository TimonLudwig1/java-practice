package ObjectOrientedProgramming.Composition;

public class CompositionMain {
    public static void main(String[] args) {
        
        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects. 

        Car car = new Car("Audi a5", 2025, "v8");   // if we would delete the car object, our engine would also get deleted, since it is part of the car

        car.getModel();
        car.getYear();
        car.getEngine();

        car.start();
    }
}
