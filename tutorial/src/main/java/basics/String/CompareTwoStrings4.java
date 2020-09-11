package basics.String;

public class CompareTwoStrings4 {
    public static void main(String[] args) {
        /*
        Comparing Strings in a Switch Statement
        As of Java 1.7, it is possible to compare a String variable to literals in a switch statement.
        Make sure that the String is not null, otherwise it will always throw a NullPointerException.
        Values are compared using String.equals, i.e. case sensitive.
         */

        String stringToSwitch = "A";

        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;

            case "A":
                System.out.println("A"); //the code goes here
                break;

            case "B":
                System.out.println("B");
                break;

            default:
                break;
        }
    }
}
