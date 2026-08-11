import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args){

        // Compund interest calculator 

        Scanner scanner = new Scanner(System.in);
        
        double principal; 
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the # of times compounded per year: ");
        timeCompound = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate/timeCompound), timeCompound * years);

        // System.out.println("The amount after " + years + "is: $" + amount);
        System.out.printf("The amount after %d years is: $%.2f \n", years, amount);
        scanner.close();
    }

}
