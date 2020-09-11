package basics.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples2 {
    private static final Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");

    public static void main(String[] args) {
        // Extract nth Digit from a String
        // If you want to extract only certain numbers from a string you can provide an index to the group() function.
        // For example, if we wanted to only extract the second set of digits from the string string1234more567string890, i.e. 567 then we can use:

        // create matcher for pattern p and given string
        Matcher m = p.matcher("string1234more567string890");

        // if an occurrence if a pattern was found in a given string...
        if (m.find()) {
            System.out.println(m.group(1)); // second matched digits
        }

        /*
        Explanation of the Pattern [^\d]*[\d]+[^\d]+([\d]+)

        ignore any non-digit
        ignore any digit (first number)
        again ignore any non-digit
        capture the second number
         */
    }
}