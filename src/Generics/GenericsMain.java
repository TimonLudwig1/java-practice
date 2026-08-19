package Generics;

public class GenericsMain {
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class, interface, or method that is compatiple with different data types
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type) - (String is an example: <Boolean>, ... )

        Box<String> box = new Box<>(); 

        box.setItem("pizza");
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>(); 

        box2.setItem(5);
        System.out.println(box2.getItem());

        Product<String,Double> product = new Product<>("pizza", 12.99); 
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        Product<String,Integer> product2 = new Product<>("ticket", 15); 
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
