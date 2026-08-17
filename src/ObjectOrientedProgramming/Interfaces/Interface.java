package ObjectOrientedProgramming.Interfaces;

public class Interface {
    public static void main(String[] args) {
        
        // Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define 
        //             Supports multiple inheritance-like behavior
        //             Usually with inheritance, a class can only have one parent, but by interfaces a child can have multiple parents 

        Rabbit rabbit = new Rabbit(); 
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
