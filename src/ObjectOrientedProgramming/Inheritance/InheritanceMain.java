package ObjectOrientedProgramming.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods from another class
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat(); 
        Plant plant = new Plant(); 

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eating();
        cat.eating();
        plant.photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
