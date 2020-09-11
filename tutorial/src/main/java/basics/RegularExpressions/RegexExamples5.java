package basics.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples5 {
    public static void main(String[] args) {
        // Extract Key-Value Pairs With Regular Expressions
        /*
        Let’s suppose we have a string of this format bookname=testing&bookid=123456&bookprice=123.45
        and we want to extract the key-value pair bookid=123456 we would use:
         */
        String s = "bookname=cooking&bookid=123456&bookprice=123.45";
        Pattern p = Pattern.compile("(?<=bookid=)\\d+");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
