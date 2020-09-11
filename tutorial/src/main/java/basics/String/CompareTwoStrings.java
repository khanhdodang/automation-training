package basics.String;

public class CompareTwoStrings {
    public static void main(String[] args) {
        /*
        Comparing Strings with equals() Method
        If we need to compare two strings in java and also care about the casing of the strings we can use the equals() method.

        For example, the following snippet will determine if the two instances of String are equal on all characters including casing:
         */

        String firstString = "Test123";
        String secondString = "Test" + 123;
        String thirdString = "TEST123";

        if (firstString.equals(secondString)) {
            System.out.println("first and second strings are equal");
        }

        if (firstString.equals(thirdString)) {
            System.out.println("first and third string are equal");
        }
    }
}
