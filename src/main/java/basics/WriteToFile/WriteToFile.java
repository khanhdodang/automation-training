package basics.WriteToFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main( String[] args ) {
        // Write to file using BufferedWriter
        try {
            String content = "Content to write to file";
            //Name and path of the file
            File file = new File("writefile.txt");

            /*
            Note: If we want to append to a file, we need to initialize the FileWriter with the true parameter:
            FileWriter fw = new FileWriter(file, true);
             */

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}
