package basics.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetCurrentDate2 {

    public static void main(String[] args) {
        /*
        Formatted Date
        We can use the DateTimeFormatter class to format the display of the date.
        For example to display the current date in the format of yyyy/mm/dd we use:
         */
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    }
}
