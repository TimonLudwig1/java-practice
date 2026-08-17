package ObjectOrientedProgramming;

public class PersonForSuper {
    
    String first;
    String last; 
    
    PersonForSuper(String first, String last){
        this.first = first;
        this.last = last; 
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}
