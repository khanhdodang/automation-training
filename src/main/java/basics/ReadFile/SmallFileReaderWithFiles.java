package basics.ReadFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class SmallFileReaderWithFiles {

    public static void main(String[] args) throws IOException {
        /*
        Reading Small Files in Java with Files Class
        The readAllLines() method of the Files class allows reading the whole content of the file and stores each line in an array as strings.

        You can use the Path class to get the path to the file since the Files class accepts the Path object of the file.
         */
        String file = "src/main/resources/file.txt";
        Path path = Paths.get(file);
        List<String> lines = Files.readAllLines(path);

        for (String string : lines) {
            System.out.println(string);
        }
    }
}
