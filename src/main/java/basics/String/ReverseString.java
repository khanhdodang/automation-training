package basics.String;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ReverseString {

    public static void main(String[] args) {
        String reverseText = "Easiest Way to Reverse a String in Java";

        String result = reverseStringBuilder(reverseText);
        System.out.println("StringBuilder: " + result);

        result = reverseRecursion(reverseText);
        System.out.println("Recursion: " + result);

        result = reverseToCharArray(reverseText);
        System.out.println("ToCharArray: " + result);

        result = reverseIntStream(reverseText);
        System.out.println("IntStream: " + result);
    }

    static String reverseStringBuilder(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    static String reverseRecursion(String inputString) {

        StringBuilder reverseStringBuilder = new StringBuilder();

        for(int i = inputString.length() - 1; i>=0; i--){
            reverseStringBuilder.append(inputString.charAt(i));
        }

        return reverseStringBuilder.toString();
    }

    static String reverseToCharArray(String inputString) {
        String outString = "";
        for(char c : inputString.toCharArray()) {
            outString = c + outString;
        }
        return outString;
    }

    static String reverseIntStream(String inputString) {
        return IntStream.range(0, inputString.length())
            .mapToObj(x-> inputString.charAt((inputString.length()-1) - x))
            .map(character -> String.valueOf(character))
            .collect(Collectors.joining(""));
    }
}
