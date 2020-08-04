package basics.String;

public class CompareTwoStrings2 {
    public static void main(String[] args) {
        /*
        Comparing Strings with equalsIgnoreCase() Method
        If we need to compare two strings in java but don’t care about the casing of the strings we can use the equalsIgnoreCase() method.

        For example, in the above code snippet, if we replaced .equals() with .equalsIgnoreCase() method, then both print statements get executed:
         */
        String firstString = "Test123";
        String secondString = "Test" + 123;
        String thirdString = "TEST123";

        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("first and second strings are equal");
        }

        if (firstString.equalsIgnoreCase(thirdString)) {
            System.out.println("first and third string are equal");
        }
    }
}
