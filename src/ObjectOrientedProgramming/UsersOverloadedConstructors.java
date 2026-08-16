package ObjectOrientedProgramming;

public class UsersOverloadedConstructors {
    
    String username;
    String email;
    int age; 

    UsersOverloadedConstructors(){
        this.username = "Not provided";
        this.email = "Not provided";
        this.age = 0;
    }
    UsersOverloadedConstructors(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    UsersOverloadedConstructors(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    UsersOverloadedConstructors(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
