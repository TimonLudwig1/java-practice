package ObjectOrientedProgramming.GettersAndSetters;
public class GettersSetters {
    public static void main(String[] args) {
        
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make field READABLE.
        // SETTERS = Methods that make a filed WRITABLE. 

        Car car = new Car("Audi", "white", 60000);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

        car.setColor("blue");
        car.setPrice(50000);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }
}
