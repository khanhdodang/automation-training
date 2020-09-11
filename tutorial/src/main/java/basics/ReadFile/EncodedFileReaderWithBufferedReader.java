package basics.ReadFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EncodedFileReaderWithBufferedReader {

    public static void main(String[] args) throws IOException {
        /*
        Reading UTF-8 Encoded File in Java with BufferedReader
        We can use the BufferedReader class to read a UTF-8 encoded file.

        This time, we pass an InputStreamReader object when creating a BufferedReader instance.
         */
        String file = "src/main/resources/fileUtf8.txt";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            //process the line as you require
            System.out.println(curLine);
        }
    }
}
