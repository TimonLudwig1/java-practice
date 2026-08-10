import java.util.Scanner;

public class math_exercise {
    public static void main(String[] args){

        // Hypotenuse: c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c; 

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is " + c + "cm");

        // circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference; 
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2); 
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3); 

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.printf("The area is: %.1fcm2\n", area);        // if we only want 1, 2, … digits after the comma: use printf() and %.1f (or .2 ; .3; …). then we only need a "," and not a "+"
        System.out.printf("The volume is: %.1fcm3\n", volume);      // now we do need a "\n", because we're not using println() anymore!



        scanner.close();

    }
    
}
