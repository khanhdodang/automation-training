package basics.Utils;

import java.time.LocalTime;

public class GetCurrentTime2 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current hour: " + now.getHour());
        System.out.println("Current minute: " + now.getMinute());
        System.out.println("Current second: " + now.getSecond());
    }
}
