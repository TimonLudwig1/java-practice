import java.util.ArrayList;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        
        // JAVA HANGMAN GAME

        String word = "Drachenlord";
        word = word.toLowerCase(); 
        ArrayList<Character> wordState = new ArrayList<>(); 
        int wrongGuesses = 0;
        
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < word.length(); i++){
            wordState.add('_'); 
        }

        System.out.println("*".repeat(23));
        System.out.println("Welcome to Java Hangman");
        System.out.println("*".repeat(23));

        while (wrongGuesses < 6){

            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");

            char guess = scanner.next().toLowerCase().charAt(0); 

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess); 
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break; 
                }
            }
            else{
                System.out.println("Wrong guess!");
                wrongGuesses++; 
            }
        }
        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        
        return switch(wrongGuesses){
            case 0 -> """
                    


                      """;
            case 1 -> """
                        o

                        
                      """;
            case 2 -> """
                        o
                        |

                      """;
            case 3 -> """
                        o
                       /|

                      """;
            case 4 -> """
                        o
                       /|\\

                      """;
            case 5 -> """
                        o
                       /|\\
                       /
                      """;
            case 6 -> """
                        o
                       /|\\
                       / \\
                      """;
            default -> "";
        };
    }
}
