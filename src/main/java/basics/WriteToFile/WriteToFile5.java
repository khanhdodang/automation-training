package basics.WriteToFile;

import java.io.*;

public class WriteToFile5 {
    public static void main( String[] args ) {
        // Write to file using DataOutputStream
        String content = "Content to write to file";

        try {
            File file = new File("writefile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            DataOutputStream dataOutStream = new DataOutputStream(bos);
            dataOutStream.writeUTF(content);
            dataOutStream.close();

        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}