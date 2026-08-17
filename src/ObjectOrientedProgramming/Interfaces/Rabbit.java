package ObjectOrientedProgramming.Interfaces;

public class Rabbit implements Prey{    // "implement not extends"
    
    @Override
    public void flee(){
        System.out.println("The rabbit is running away");
    }
}
