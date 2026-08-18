import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
    public static void main(String[] args) {
        
        // How to PLAY AUDIO with Java (.wac, .au, .aiff)

        String filePath = "data\\music.wav"; 
        File file = new File(filePath); 

        // try with resources automatically closes ressources - we don't need the finally block 

        try(Scanner scanner = new Scanner(System.in);                               // keep the music playing - either threading or a simple scanner 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){  
            
            Clip clip = AudioSystem.getClip(); 
            // clip object opens our audioStream object
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase(); 

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.stop(); 
                    default -> System.out.println("Invalid choice");
                }

            }

        }
        catch(FileNotFoundException e){
            System.out.println("File could not be located");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio ressource");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Bye!");
        }
    }
}
