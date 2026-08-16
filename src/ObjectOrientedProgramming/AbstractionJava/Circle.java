package ObjectOrientedProgramming.AbstractionJava;

public class Circle extends Shape{
    
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    // children need to overwrite the abstract method
    
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
