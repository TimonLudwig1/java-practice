package Basics;
public class BreakContinue {
    public static void main(String[] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){

            if(i == 5){
                // break;   // stop at 5
                continue;   // skip 5 
            }
            System.out.print(i+ " ");
        }
    }
    
}
