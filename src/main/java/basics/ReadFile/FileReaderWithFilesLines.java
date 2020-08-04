package basics.ReadFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileReaderWithFilesLines {

    public static void main(String[] args) throws IOException {
        /*
        Reading Files with Files.lines()
        Java 8 introduced a new method to the Files class to read the whole file into a Stream of strings.
         */
        String file = "src/main/resources/file.txt";
        Path path = Paths.get(file);
        Stream<String> lines = Files.lines(path);

        lines.forEach(s -> System.out.println(s));
        lines.close();
    }
}
