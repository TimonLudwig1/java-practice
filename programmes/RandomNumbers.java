import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        double number3;
        boolean isHeads;

        number1 = random.nextInt(1, 100);  // first number is inclusive, last number is exclusive 
        number2 = random.nextInt(1, 100);
        number3 = random.nextDouble(1, 2);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        
        if(isHeads){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }
    }
}
