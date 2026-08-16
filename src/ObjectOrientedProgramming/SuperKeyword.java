package ObjectOrientedProgramming;
public class SuperKeyword {
    public static void main(String[] args) {
        
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overwriting
        //         Calls the parent constructor to initiallize attributes 

        PersonForSuper person = new PersonForSuper("Bobby", "Riddler");

        person.showName();

        StudentForSuper student = new StudentForSuper("Harry", "Tschigerillo", 4.0); 

        student.showName();
        student.showGpa();

        EmployeeForSuper employee = new EmployeeForSuper("Maggus", "Rühl", 6942); 
        employee.showName();
        employee.showSalary();
    }
}
