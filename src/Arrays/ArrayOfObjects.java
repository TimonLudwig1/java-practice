package Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        
        // CarForArrays car1 = new CarForArrays("Audi", "black");
        // CarForArrays car2 = new CarForArrays("BMW", "white");
        // CarForArrays car3 = new CarForArrays("Mercedes", "silver");

        // data type of the array: CarArrays objects - so CarArrays[]

        // CarForArrays[] cars = {car1, car2, car3};

        //we can also pass in anonymus objects - no unique identifier
        CarForArrays[] cars = {new CarForArrays("Audi", "black"), new CarForArrays("BMW", "white"), new CarForArrays("Mercedes", "silver")};

        for(CarForArrays car : cars){
            car.drive();
        }

        for(CarForArrays car : cars){
            car.color = "black"; 
        }
        
        for(CarForArrays car : cars){
            car.drive();
        }
    }
}
