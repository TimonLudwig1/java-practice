package Collections;

public class WrapperClassesMain {
    public static void main(String[] args) {
        
        // Wrapper classes = Allow a primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object. 
        //                   Allows use of Collections Framework and static Utility Methods. 

        // usually you use "Autoboxing" but to learn what wrapper classes are and how they work we use a different method

        // Integer a = new Integer(123); // this is deprecated, it even crosses it out in vscode - don't do this in practice!
        // Double b = new Double(3.14); 
        // Character c = new Character('$');
        // Boolean d = new Boolean(true); 


        // this is how you actually do it - Autoboxing

        Integer a = 4;
        Double b = 43.69;
        Character c = '%'; 
        Boolean d = false; 
        // this is very similar to creating strings:
        String e = "Test"; 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // Unboxing - convert object back to primitve 

        int x = a; 
        double y = b; 
        // ... 
        System.out.println(x);
        System.out.println(y);

        // a few methods

        String s = Integer.toString(123); 
        String t = Double.toString(3.14); 
        String j = Character.toString('@');
        String k = Boolean.toString(false); 

        String full = s + " " + t + " " + j + " " + k;
        System.out.println(full);

        // parsing

        int q = Integer.parseInt("123"); 
        double r = Double.parseDouble("3.14");
        char l = "Pizza".charAt(0);
        boolean m = Boolean.parseBoolean("true"); 

        System.out.println(q);
        System.out.println(r);
        System.out.println(l);
        System.out.println(m);

        char letter = 'b'; 

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
