package Java8.DateAndTimeAPI;

import java.time.*;

public class Example {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, Month.NOVEMBER, 20);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Kolkata"));
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);



    }
}
