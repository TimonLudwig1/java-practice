public class string_methods {
    public static void main(String[] args){

        String name = "Charlie Kirk";
        String name2 = "    Charles Boba    ";
        String name_empty = ""; 

        int lenght = name.length();
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
    }
}
