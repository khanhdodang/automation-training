package basics.ReadFile;

import java.io.*;

public class FileReaderWithBufferedReader {

    public static void main(String[] args) throws IOException {
        /*
        Reading Text Files in Java with BufferedReader
        The BufferedReader class reads a character-input stream.
        It buffers characters in a buffer with a default size of 8 KB to make the reading process more efficient.
        If you want to read a file line by line, using BufferedReader is a good choice.

        BufferedReader is efficient in reading large files.
         */

        String fileName = "src/main/resources/file.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null){
            //process the line as required
            System.out.println(curLine);
        }
        bufferedReader.close();
    }
}
