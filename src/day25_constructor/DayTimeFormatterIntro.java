package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DayTimeFormatterIntro {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEEE, MMM/d/y");

        LocalDate today= LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1=LocalDate.of(2022,7,12);
        System.out.println(date1.format(df));//July-01-22

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm a");//local time format
        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf));


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();
        System.out.println("Date & Time: "+starts.format(dtf));

        System.out.println("--------------class task-----------------------");

        LocalDateTime printTime= LocalDateTime.of(2020,11,24,13,00);
        DateTimeFormatter taskTime= DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(printTime.format(taskTime));




    }
}
