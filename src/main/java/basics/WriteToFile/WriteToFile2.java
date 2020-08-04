package basics.WriteToFile;

import java.io.*;

public class WriteToFile2 {
    public static void main( String[] args ) {
        // Write to file using PrintWriter
        try {
            String content = "Content to write to file";
            //Name and path of the file
            File file = new File("writefile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            PrintWriter bw = new PrintWriter(fw);
            bw.write(content);
            bw.close();

        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}