package util;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
	
public class ioOutput {
	public static void main(String[] args) {
        String name = "Weather Wiki";

        FileWriter fwo;
        try {
            fwo = new FileWriter(new File("output.txt"));
             
            /**
             * Change the string to the actual output needed to write to file.
             */
            fwo.write(String.format("Change string to print output",name));

            fwo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        System.out.println("Done");
         
    }
 
}
