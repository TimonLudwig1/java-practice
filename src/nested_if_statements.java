public class Nested_if_Statements {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You are a senior and a student, you get multiple discounts: ");
                System.out.println("You get a senior discount of 20%");
                System.out.println("And you get a student discount of 10%");

                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9; 
            }
        }
        else{
            if(isSenior){
                System.out.println("Your are a senior, you get a discount of 20%");
                price *= 0.8;
            }
            else{
                System.out.println("You do not get any discounts!");
                price *= 1; // this doesn't do anything, just for visuals
            }
        }

        System.out.printf("The price of the ticket is: $%.2f\n", price);
    }
}
