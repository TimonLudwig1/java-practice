package ObjectOrientedProgramming;
public class IntroOOPMain {
    public static void main(String[] args) {
        
        // Object = An entity that holds data (attributes)
        //          and can performe actions mehtods 
        // It is a reference data type - data for an object is stored in the heap 

        // now we can create a Car object 

        Car car = new Car(); 

        // car.isRunning = true; // we can change attributes 

        // System.out.println(car); printing our object would give us the memory address, since it is a reference data type 

        System.out.println(car.make);   // to access things within an object we use the "." operator 
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();
     
    }
}
