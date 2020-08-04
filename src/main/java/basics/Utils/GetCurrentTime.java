package basics.Utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTime {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Time now: " + now.toString());
        System.out.println("Formatted time: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
