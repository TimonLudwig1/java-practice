package ObjectOrientedProgramming.Super;

public class SuperKeyword {
    public static void main(String[] args) {
        
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overwriting
        //         Calls the parent constructor to initiallize attributes 

        Person person = new Person("Bobby", "Riddler");

        person.showName();

        Studen student = new Studen("Harry", "Tschigerillo", 4.0); 

        student.showName();
        student.showGpa();

        Employee employee = new Employee("Maggus", "Rühl", 6942); 
        employee.showName();
        employee.showSalary();
    }
}
