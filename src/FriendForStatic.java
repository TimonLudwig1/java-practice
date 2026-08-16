public class FriendForStatic {
    
    static int numOfFriends;    //with static, all Friends share this variable
    String name; 

    FriendForStatic(String name){
        this.name = name; 
        numOfFriends++; 
    }

    //static method
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends"); //when accessing a static attribute, you don't need "this."
    }
}
