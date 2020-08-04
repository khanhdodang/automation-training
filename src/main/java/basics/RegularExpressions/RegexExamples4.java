package basics.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples4 {
    public static void main (String[] args) {
        // Extract a String Containing digits and Characters
        /*
        You can use Java regular expressions to extract a part of a String which contains digits and characters.
        Suppose we have this string Sample_data = YOUR SET ADDRESS IS 6B1BC0 TEXT and we want to extract 6B1BC0 which is 6 characters long, we can use:
         */
        Pattern p = Pattern.compile("YOUR SET ADDRESS IS\\s+([A-Z0-9]{6})");
        Matcher n = p.matcher("YOUR SET ADDRESS IS 6B1BC0 TEXT");
        if (n.find()) {
            System.out.println(n.group(1)); // Prints 123456
        }
    }
}
