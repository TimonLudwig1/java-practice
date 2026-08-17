package ObjectOrientedProgramming.Composition;

public class Car {
    
    private String model;
    private int year;
    private Engine engine; 

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void getModel(){
        System.out.println("The cars model is a: " + this.model);
    }
    void getYear(){
        System.out.println("The car is from: " + this.year);
    }
    void getEngine(){
        System.out.println("The car's engine is a: " + this.engine.type);
    }
    void setModel(String model){
        this.model = model;
    }
    void setYear(int year){
        this.year = year;
    }
    void setEngine(Engine engine){
        this.engine = engine; 
    }
    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
