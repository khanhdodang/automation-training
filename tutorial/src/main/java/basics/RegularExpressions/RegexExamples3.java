package basics.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples3 {
    public static void main(String[] args) {
        // Extract Number from a Tag Attribute
        // <result name="response" numFound="9999" start="0">
        Pattern pattern = Pattern.compile("numFound=\"([0-9]+)\"");
        Matcher matcher = pattern.matcher("");

        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
