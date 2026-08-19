package TimeHandling;

public class MyRunnable implements Runnable {
    
    // any code you want to run seperate - place in the run method

    @Override
    public void run(){

        for(int i = 1; i <= 5; i++){
            try{Thread.sleep(1000); // when typing "Thread", it refers to the current thread (here: Main)
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if (i == 10) {
                System.out.println("Time's up");
                System.exit(0); //this ends the programm after i seconds (the entire programm, also main)
            }
        }
    }
}
