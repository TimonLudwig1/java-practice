package Enums;

public enum Day {
    
    // enum constants - we write them in all uppercase with a value 

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), PIZZADAY(8);

    // we need to create a constructor for the enum class, when we define these enum constants, we automatically call the constructor and pass in the values

    private final int dayNumber;    // final: element cannot be changed anymore 

    Day(int dayNumber) {

        this.dayNumber = dayNumber; 
    } 
    public int getDayNumber(){
        return dayNumber; 
    }
}
