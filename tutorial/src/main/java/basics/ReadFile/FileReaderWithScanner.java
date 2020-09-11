package basics.ReadFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithScanner {

    public static void main(String[] args) throws IOException {
        String file = "src/main/resources/scanner.txt";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");

        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();
    }
}
