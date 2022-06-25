package day24_dateAndTime;

import java.time.LocalDate;

public class BirthdayPractice {
public static void birthDay(int year ,int month, int day) {

    LocalDate todayDate = LocalDate.now();
    int age = todayDate.getYear() - year;
    if (month == todayDate.getMonthValue() && day == todayDate.getDayOfMonth()) {
        System.out.println("Happy birthday!");
    } else {
        System.out.println("It's not you birthday but you are only " + age + " years old");
    }
}}


/*
Create a function named birthday, that takes three int arguments:
  1. year
  2. month
  3. day

the function should be able to print the age and "Happy birthday" if today is the birthday
otherwise the function will print "Today is not your birthday.
      ex:
          birthday(1993, 6, 16);
      output:
            Happy Birthday
            You are 29 years old
 */