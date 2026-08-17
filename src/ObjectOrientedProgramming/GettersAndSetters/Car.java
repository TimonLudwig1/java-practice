package ObjectOrientedProgramming.GettersAndSetters;

public class Car {
    
    private String model;   //when adding "private" we cannot acces them outside the car class directly - so we need methods for that
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price; 
    }

    // Getter method

    String getModel(){
        return this.model; 
    }
    String getColor(){
        return this.color; 
    }
    String getPrice(){
        return "$" + this.price; 
    }

    // Setter methods - we want to change some attributes even tho they are "private" - so we use methods for that

    void setColor(String color){
        this.color = color;
    }
    //we can also add new logic
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be negative!");
        }
        else{
            this.price = price;
        }
    }

}
