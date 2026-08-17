package ObjectOrientedProgramming;

public class StudentForSuper extends PersonForSuper{
    
    double gpa;

    StudentForSuper(String first, String last, double gpa){
        super(first, last); // sending the first an last name to the parent in the childs constructor - with the super() method; super refers to the parent
        this.gpa = gpa; 
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}
