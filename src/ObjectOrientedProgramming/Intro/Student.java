package ObjectOrientedProgramming.Intro;

public class Student {
 
    String name;
    int age;
    double gpa; 
    boolean isEnrolled; 

    // constructor 

    Student(String name, int age, double gpa){   //the parameter names do not have to have the same name as the attributes in the beginning 
        this.name = name;                                   // - but keep them the same as best practice 
        this.age = age;     // "this" refers to the object we are currently constructing or otherwise working with 
        this.gpa = gpa;
        this.isEnrolled = true; // we don't need to pass arguments for every argument, so we can set a value in the constructor
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
