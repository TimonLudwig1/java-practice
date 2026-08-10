public class printf_statement {
    public static void main(String[] args){
        
        //printf() = is a method used to format output 

        // %[flags][width][.precision][specifier-character]

        // wherever we would like to insert a variable, we can use a % sign, then add one of a few characters for specification

        String name = "Charlie Krik";
        char firstLetter = 'C';     // char has to be in '' single 
        int age = 30;
        double height = 185.4;
        boolean isEmployed = false; 

        System.out.printf("Hello %s\n", name);   // % as placeholder, then specifier: "what is the data type?"; s for String, then we only need a comma seperator for variable
        System.out.printf("Your name starts with %c\n", firstLetter);   // for char we use a "c"
        System.out.printf("You are %d years old\n", age);   // for integers we use "d"
        System.out.printf("Your height is: %f\n", height);  // for double we use "f" ("floating point number")
        System.out.printf("Employed: %b\n", isEmployed);   // for boolean just "b"
    
        // displaying multiple variables within the same line:

        System.out.printf("%s is %d years old\n", name, age);   // multiple variables: multiple commas to seperate 

        // now: [.precision] - limiting the ammount of digits we display:

        double price1 = 9.99;
        double price2 = 19.45;
        double price3 = 199.04;

        // without any specification it displays 6 digits after the comma

        System.out.printf("%.2f\n", price1);          // to limit digits, type a "." and the number of digits between the % and the "f"
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.1f\n", price3);

        /*
        next: [flags]:

        + = output a plus
        , = comma grouping seperator (for example: 6.900,425)
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive (actal space, not the word "space")
        */

        double price4 = 900.99;
        double price5 = 6900.425;
        double price6 = -4200.67;

        System.out.println("Check out the flags: \n");
        System.out.printf("% ,.2f\n", price4);       // add the flag after the % and before the "."      
        System.out.printf("% ,.3f\n", price5);
        System.out.printf("% ,.1f\n", price6);

        /*
        [width]

        0 = zero padding
        number = right justified padding 
        negative number = left justified padding 
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //by setting the width, we can aligne the integers, even tho they have a different number of digits

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);    //if you want left bound, add a "-" infront of the digit ammount
        System.out.printf("%4d\n", id3);   // for zero padding: placeholder: "%", then "0" and after that the ammount of digits to zero pad
        System.out.printf("%4d\n", id4);   // if you just want to align it: remove the 0
    }
    
}
