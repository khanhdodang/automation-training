package basics.Utils;

import java.time.LocalDate;

public class GetCurrentDate {

    public static void main(String[] args) {
        // The LocalDate class is used to represent a date.
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }
}
