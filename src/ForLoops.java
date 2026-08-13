import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of time 
        // for(initialization - keep track how many times we iteratd - usually: int i (= loop control variable); condition ; steps / update - increment/decrement the counter)

        for(int i = 10; i > 0 ; i--){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter how many times you want to loop: ");
        // int max = scanner.nextInt();

        // for(int i = 1 ; i <= max ; i++){
        //     System.out.println(i);
        // }

        int start;

        System.out.println("Enter a number for the countdown");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //time in milliseconds
        }
        System.out.println("HAPPY NEW YEAR");

        scanner.close();
    }
}
