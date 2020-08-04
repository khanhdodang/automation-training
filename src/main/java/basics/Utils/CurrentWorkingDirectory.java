package basics.Utils;

public class CurrentWorkingDirectory {

    public static void main (String args[]) {

        String cwd = System.getProperty("user.dir");
        System.out.println("Current working directory : " + cwd);

    }
}