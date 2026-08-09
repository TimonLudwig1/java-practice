public class Variables {
    public static void main(String[] args){

    
    // 2 Steps to creating a variable 
    // ------------------------------
    // 1. decleration
    // 2. assignement

    int age = 21;  // this is decleration: we declare a data type + assignement: give it a value 
    int year = 2026;
    int quantity = 1;

    double price = 19.99;
    double gpa = 3.5;
    double temperature = - 12.5;

    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    boolean isStudent = true;       //in java we use camelCase for names with two words 
    boolean forSale = false;
    boolean isOnline = true;

    String name = "Timon Ludwig";
    String food = "Sandwich"; 
    String email = "timonludwig1@gmx.de";
    String car = "Mustang";
    String color = "red"; 

    System.out.println("My Car is a: " + color + " " + car + " from " + year);
    

    if (isStudent) {
        System.out.println("You are a student!");
    }
    else{
        System.out.println("You are not a student!");
    }

    System.out.println(isStudent);


    System.out.println(grade);

    System.out.println("$" + price);

    System.out.println(age);
    System.out.println("The year is " + year);

    }
}
