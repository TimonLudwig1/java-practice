package FileHandlingAndExceptions.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        
        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line - BufferedReader can't read on its own, it acts as a middle man 
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "src\\FileHandlingAndExceptions\\in\\Input.txt"; 

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){      // we need to pass in a reader object into the constructor of the BufferedReader
            
            String line; 
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        

    }
}
