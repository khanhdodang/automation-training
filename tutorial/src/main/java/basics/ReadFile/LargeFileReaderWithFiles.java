package basics.ReadFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeFileReaderWithFiles {

    public static void main(String[] args) throws IOException {
        /*
        Reading Large Files in Java with Files Class
        If you want to read a large file with the Files class, you can use the newBufferedReader() method to obtain an instance of BufferedReader class and read the file line by line using a BufferedReader.
         */
        String file = "src/main/resources/file.txt";
        Path path = Paths.get(file);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            System.out.println(curLine);
        }
        bufferedReader.close();
    }
}
