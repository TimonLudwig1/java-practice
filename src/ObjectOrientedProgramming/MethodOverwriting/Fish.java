package ObjectOrientedProgramming.MethodOverwriting;

public class Fish extends Animal{
    
    // overwrite the inherited method - it is good practice to write @Overwrite when overwriting a method

    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}
