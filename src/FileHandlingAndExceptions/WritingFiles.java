package FileHandlingAndExceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        
        // How to write files using Java ( 4 popular options)

        // FileWrite = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "src\\FileHandlingAndExceptions\\out\\test.txt"; 
        String textContent = """    
                Roses are red
                Violets are blue
                I like pizza
                And so do you! 
                """; 

        // reading and writing files can be unpredictable, so we enclose it in a try catch block!
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){       //IOException = input output exception 
            System.out.println("Could not write file");
        }
    }
}
