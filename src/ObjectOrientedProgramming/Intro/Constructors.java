package ObjectOrientedProgramming;

public class Constructors {
    public static void main(String[] args) {
        
        // constructor = A special method to initialize the objects
        //               You can pass arguments to a constructor
        //               and set up initial values 

        StudentConstructor student1 = new StudentConstructor("Olaf Abi", 55, 3.2); 
        StudentConstructor student2 = new StudentConstructor("Big Bobber", 21, 1.2); 

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        student1.study();
        student2.study();
    }
}
