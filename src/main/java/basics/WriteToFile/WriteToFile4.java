package basics.WriteToFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile4 {
    public static void main( String[] args ) {
        // Write to file using Files class
        Path path = Paths.get("writefile.txt");
        String content = "Content to write to file";

        try {
            byte[] bytes = content.getBytes();
            Files.write(path, bytes);
        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}