package basics.Utils;

import java.time.LocalDate;

public class GetCurrentDate3 {

    public static void main(String[] args) {
        /*
        LocalDate class has other useful methods that we can use to get more detail about the current date such as:
         getDayOfWeek(), getDayOfMonth(), getDayOfYear()
         */
        LocalDate now = LocalDate.now();
        System.out.println("Today's date: " + now.toString());
        System.out.println("Day of week: " + now.getDayOfWeek().toString());
        System.out.println("Day of month: " + now.getDayOfMonth());
        System.out.println("Day of year: " + now.getDayOfYear());
    }
}