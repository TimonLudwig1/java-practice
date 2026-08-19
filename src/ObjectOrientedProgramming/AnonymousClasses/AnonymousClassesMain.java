package ObjectOrientedProgramming.AnonymousClasses;

public class AnonymousClassesMain {
    public static void main(String[] args) {
        
        // Anonymous class = A class that doesn't have a name. Cannot be reused. 
        //                   Add custom behavoir without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)
        
        Dog dog1 = new Dog();
        dog1.speak();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();

        // it is way too much work to create a new class, just for one unique object, so we create an anonymous class!
        // we create an object of the class and define unique methods, attributes etc. in { }; 

        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            };
        }; 

        dog2.speak();
    }
}
