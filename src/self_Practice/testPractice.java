package self_Practice;
import java.time.LocalDate;

public class testPractice {
public static boolean isLeapYear(int year,int month,int day){
    return LocalDate.of(year, month, day).isLeapYear();
}

    public static void main(String[] args) {
        System.out.println(isLeapYear(2016,05,29));
    }
}
