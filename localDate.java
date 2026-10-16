import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;
class localDate{
    public static void main(String []a){
        // LocalDate methods:
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());
        System.out.println(dt.getDayOfYear());
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.lengthOfYear());
        System.out.println(dt.lengthOfMonth());
        System.out.println(dt.isLeapYear());

        // LocalTime methods:
        LocalTime tt=LocalTime.now();
        System.out.println(tt);
        System.out.println(tt.getHour());
        System.out.println(tt.getMinute());
        

        // LocalDateTime methods:
        LocalDateTime dtt = LocalDateTime.of(2026, 10, 15, 10, 30, 45);
        System.out.println("Date and time: " + dtt);

        // ZoneDateTime methods:
        ZonedDateTime chennai=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Chennai: " + chennai);

        // DateTimeFormatter methods:
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd mm yyyy HH:MM:SS");
        System.out.println(dtt.format(dtf));

        // Period methods:
        LocalDate start=LocalDate.of(2027,11,19);
        LocalDate end=LocalDate.of(2027,11,11);
        System.out.println(Period.between(start,end));

        // Duration methods:
        LocalTime st=LocalTime.of(23,23,23);
        LocalTime ed=LocalTime.of(23,24,24);
        System.out.println(Duration.between(st,ed));

    }
}