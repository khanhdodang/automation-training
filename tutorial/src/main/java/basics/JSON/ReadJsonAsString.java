package basics.JSON;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonAsString {

    public static void main(String[] args) throws Exception {
        // Read JSON File as String
        String file = "src/main/resources/myFile.json";
        String json = readFileAsString(file);
        System.out.println(json);
    }

    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
