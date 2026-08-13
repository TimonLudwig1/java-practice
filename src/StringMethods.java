public class StringMethods {
    public static void main(String[] args){

        String name = "Charlie Kirk";
        String name2 = "    Charles Boba    ";
        String name_empty = ""; 

        int length = name.length();
        char letter = name.charAt(0);       // character at index
        int index = name.indexOf("r");          // index of first char
        int lastIndex = name.lastIndexOf("r");  // index of last char 
        
        String name_upper = name.toUpperCase();
        String name_lower = name.toLowerCase();

        String name_trimmed = name2.trim(); // remove whitespace before and after String
        String name_replaced = name.replace("r", "i");

        boolean noName = name_empty.isEmpty();    // true if String is empty, useful in if statements
        boolean contains = name.contains("o"); 

        boolean isEqual = name.equals("Charlie Kirk");  // in java we need a String method, not like in Python with "=="
        boolean isEqual2 = name.equalsIgnoreCase("charlie kirk");   // equals is case sensitive, so we need a different mehtod

        System.out.println(isEqual2);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name_upper);
        System.out.println(name_lower);
        System.out.println(name_trimmed);
        System.out.println(name_replaced);
        System.out.println(noName);
        System.out.println(isEqual);
        System.out.println(contains);
    }
}
