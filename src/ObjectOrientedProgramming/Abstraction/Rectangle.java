package ObjectOrientedProgramming.Abstraction;

public class Rectangle extends Shape{

    double lenght;
    double width;

    Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

   // children need to overwrite the abstract method
    
    @Override
    double area(){
        return lenght * width;
    }
}
