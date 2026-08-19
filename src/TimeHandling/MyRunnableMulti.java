package TimeHandling;

public class MyRunnableMulti implements Runnable {
    
    private final String text; 
    private final int sleepTime; 

    MyRunnableMulti(String text, int sleepTime){
        this.text = text; 
        this.sleepTime = sleepTime; 
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(sleepTime);
                   System.out.println(Thread.currentThread().getName() + " " + text);
            } 
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
