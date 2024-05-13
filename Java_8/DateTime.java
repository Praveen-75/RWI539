package Java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : " + current);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String forMatedDateTime = current.format(format);
        System.out.println("formatted manner " + forMatedDateTime);


        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();

        System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

        LocalDate date2 = LocalDate.of(2002, 7, 4);
        System.out.println("the birthday :" + date2);

    }
}
