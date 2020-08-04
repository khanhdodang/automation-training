package basics.WriteToFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile3 {
    public static void main( String[] args ) {
        // Write to file using FileOutputStream
        try {
            String content = "Content to write to file";
            //Name and path of the file
            File file = new File("writefile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileOutputStream outStream = new FileOutputStream(file);
            byte[] strToBytes = content.getBytes();
            outStream.write(strToBytes);

            outStream.close();

        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}