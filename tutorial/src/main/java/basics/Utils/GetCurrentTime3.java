package basics.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTime3 {

    public static void main(String[] args) {
        // To get the current date and time, we can use the LocalDateTime class
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss")));
        System.out.println("Day of month: " + now.getDayOfMonth());
        System.out.println("Current hour: " + now.getHour());
    }
}
