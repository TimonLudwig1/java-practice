package ObjectOrientedProgramming.AbstractionJava;

public class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // children need to overwrite the abstract method
    
    @Override
    double area(){
        return 0.5 * base * height;
    }
 
}
