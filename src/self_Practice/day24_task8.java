package self_Practice;

import java.time.LocalDate;

public class day24_task8 {
    public static void main(String[]args){
        System.out.println(isLeapYear(2016,7,24));
    }
    public static  boolean isLeapYear(int year, int month,int day){

        return LocalDate.of(year,month,day).isLeapYear();
}
}
/*

8. Create a function that accepts an int argument birthYear,
 return true if the person was born on leap year, otherwise return false
 */