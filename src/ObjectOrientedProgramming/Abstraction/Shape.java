package ObjectOrientedProgramming.Abstraction;

// we add the 'abstract' keyword - we can't create any shape objects

public abstract class Shape {
    
    // abstract method - every child needs this! 

    abstract double area(); 

    // concrete method 
    
    void display(){
        System.out.println("This is a shape");
    }
}
