package basics.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Playground {
    public static void main(String[] args) {

        String eventA = "08.05.25";
        String eventB = "10.05.2024";


        LocalDate today = LocalDate.now();
        System.out.println("date1=" + today);

        LocalDate todayMinus50Day = today.minusDays(50);

        LocalDate yesterday = LocalDate.of(2024, 2, 4);
        System.out.println(today);
        System.out.println(yesterday);

        LocalDate tomorrow = yesterday.plusDays(2);

        System.out.println(today.minusDays(50).isLeapYear());

        LocalDate subscriptionsDay = LocalDate.now().plusDays(90);


        //time
        //При тестировании играть с часовыми поясами!
        LocalTime time = LocalTime.now();
        System.out.println("time=" + time);


        LocalTime fromDB= LocalTime.of(21, 18, 59);
        LocalTime now = LocalTime.now(ZoneId.of("Europe/Paris"));

        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime);


        DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        String timestamp1 = formatter.format(dateTime);
        System.out.println(timestamp1);

        //yyyy - год
        //MM - month
        //dd - day
        //HH - hours
        //mm - минуты
        //ss - секунды

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
        String timestamp = formatterDate.format(dateTime);
        System.out.println(timestamp);

        String myDate = "05/02/2024";
        LocalDate date1 = LocalDate.parse(myDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date1);

    }
}
