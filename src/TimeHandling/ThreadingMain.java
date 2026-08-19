package TimeHandling;

import java.util.Scanner;

public class ThreadingMain {
    public static void main(String[] args) {
        
        // Threading = Allows a programm to run multiple tasks simultaneously 
        //             Helps improve performance with time consuming operations
        //             (File I/O, network communications, or any background tasks)

        // How to create a Thread:
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        // without threading, the programm runs on the "Main thread"

        Scanner scanner = new Scanner(System.in); 

        MyRunnable myRunnable = new MyRunnable(); 
        Thread thread = new Thread(myRunnable); 

        // if we want to end our thread when the main thread is done, we need to create a dameon thread
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("Hello " + name);

        

        scanner.close();
    }
}
