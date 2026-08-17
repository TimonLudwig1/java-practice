package ObjectOrientedProgramming.Intro;

public class Constructors {
    public static void main(String[] args) {
        
        // constructor = A special method to initialize the objects
        //               You can pass arguments to a constructor
        //               and set up initial values 

        Student student1 = new Student("Olaf Abi", 55, 3.2); 
        Student student2 = new Student("Big Bobber", 21, 1.2); 

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
