import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit; 

        System.out.println("Enter a temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Farenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32; 
        System.out.printf("The new temperature is %.2f %s\n", newTemp, unit);

        scanner.close();
    }
    
}
