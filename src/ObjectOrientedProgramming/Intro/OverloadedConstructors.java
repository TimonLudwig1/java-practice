package ObjectOrientedProgramming.Intro;

public class OverloadedConstructors {
    public static void main(String[] args) {
        
        // overloaded constructors = Allow a class to have multiple constructors 
        //                           with different parameter lists
        //                           Enable objects to be initialiazed in various ways

        UsersOverloadedConstructors user1 = new UsersOverloadedConstructors("Olaf");
        UsersOverloadedConstructors user2 = new UsersOverloadedConstructors("Zaraki", "zeraki.kenp@gmail.com");
        UsersOverloadedConstructors user3 = new UsersOverloadedConstructors("Luffy", "luffy.monkey@gmail.com", 19);
        UsersOverloadedConstructors user4 = new UsersOverloadedConstructors();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
