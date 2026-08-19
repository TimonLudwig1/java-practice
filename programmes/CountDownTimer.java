import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        
        // Java Countdown timer programm

        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter # of secnonds to count down from: ");
        int response = scanner.nextInt(); 

        Timer timer = new Timer(); 
        
        // we don't plan on reusing this class, so there is no point in creating a whole new class with an overwritten run() method - we use an anonymous class

        TimerTask timerTask = new TimerTask(){

            int count = response; 

            @Override
            public void run(){
                System.out.println(count);
                count--; 
                if(count < 0){
                    System.out.println("Happy New Year! ");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);  //(task, delay, peroid)
        scanner.close();
    }
}
