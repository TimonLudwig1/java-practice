public class substrings {
    public static void main(String[] args){
        
        // .substring() = A method to extract a portion of a stirng -> .substring(start, end);

        String email = "kontakt.timon.ludwig@gmail.com"; 
        String username = email.substring(0, 20);   // 0 indexing, last one is excluding
        String domain = email.substring(21, 30);
        int at_sign = email.indexOf("@");
        String username2 = email.substring(0, email.indexOf("@"));
        String username3 = email.substring(0, email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        System.out.println(at_sign);
        System.out.println(username2);
        System.out.println(username3);
    }
}
