package task2;

import java.io.BufferedReader; //reads from inputs stream (file)
import java.io.FileReader; //allows to read contents of a file as a stream of chr
import java.io.IOException;

//I renamed it because FileReader is a class in java already
public class FileReaderLab1 {
    //it will be called on fileReaderUtil from java.io.FileReader
    public String readFileIntoString(String path){
        StringBuilder contentBuilder = new StringBuilder(); //is used to accumulate lines of text

        //BufferReader automatically closes the resource when it is no longer needed, it reads using FileReader(path)
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {
            //accumulating lines of text
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file: " + path);
            e.printStackTrace();
            return null;
        }

        return contentBuilder.toString();
    }
}
