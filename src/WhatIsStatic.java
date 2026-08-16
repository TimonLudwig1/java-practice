public class WhatIsStatic {
    public static void main(String[] args) {
        
    // static = Makes a variable or method belong to the class
    //          rather than to any specific object.
    //          Commonly used for utility methods or shared resources  

    FriendForStatic friend1 = new FriendForStatic("Olaf"); 
    FriendForStatic friend2 = new FriendForStatic("Fritze"); 
    FriendForStatic friend3 = new FriendForStatic("Robert"); 
    FriendForStatic friend4 = new FriendForStatic("Charlie"); 
    FriendForStatic friend5 = new FriendForStatic("Georg"); 

    System.out.println(friend1.name);
    System.out.println(friend2.name);
    System.out.println(friend3.name);
    System.out.println(friend4.name);
    System.out.println(friend5.name);

    System.out.println(FriendForStatic.numOfFriends);   // we use the class itself to access a static attribute - better for clarity 

    FriendForStatic.showFriends();

    // example: Math methods:

    System.out.println(Math.round(23.5)); 

    }
}
