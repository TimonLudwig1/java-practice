package TimeHandling;

public class MultithreadingMain {
    public static void main(String[] args) {
        
        // Multithreading = Enables a programm to run multiple threads concurrently 
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations
 
        Thread thread1 = new Thread(new MyRunnableMulti("Ping", 1000)); 
        Thread thread2 = new Thread(new MyRunnableMulti("Pong", 1001)); 

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        // making main thread wait for the other threads
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }
        System.out.println("GAME OVER!");
    }
}
