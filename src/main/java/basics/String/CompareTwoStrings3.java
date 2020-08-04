package basics.String;

public class CompareTwoStrings3 {
    public static void main(String[] args) {
        /*
        Do not use the == operator to compare Strings
        Note: When comparing two strings in java, we should not use the == or != operators.
        These operators actually test references, and since multiple String objects can represent the same String, this is liable to give the wrong answer.

        Instead, use the String.equals(Object) method, which will compare the String objects based on their values.
         */

        String firstString = "Test123";
        String secondString = "Test123";
        String thirdString = new String("Test123");

        if (firstString == secondString) {
            System.out.println("first and second strings are equal");
        }

        if (firstString == thirdString) {
            System.out.println("first and third strings are equal");
        }
    }
}
