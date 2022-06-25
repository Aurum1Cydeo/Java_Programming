package self_Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day24_practice {
    public static void main(String[] args) {

        System.out.println("---------------Task1-------------------------");
        ArrayList<Integer> uniqueEl=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        uniqueEl.removeIf(p-> Collections.frequency(uniqueEl,p)>1);
        System.out.println(uniqueEl);

        System.out.println("---------------Task 2------------------------");
        ArrayList<Character> digitsRemoved=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        digitsRemoved.removeIf(p-> Character.isDigit(p.charValue()));
        System.out.println(digitsRemoved);

        System.out.println("------------------Task 3---------------------");
        ArrayList<Character> noLetters=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        noLetters.removeIf(p-> Character.isLetter(p.charValue()));
        System.out.println(noLetters);

        System.out.println("------------------Task 4--------------------");
        ArrayList<Character> digits1=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        digits1.removeIf(p->!Character.isLetterOrDigit(p.charValue()));
        System.out.println(digits1);

        System.out.println("-------------------Task 5-------------------");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        nums.removeIf(p -> p == Collections.max(nums) || p == Collections.min(nums));//remove max number 8 and min number -2

        System.out.println("2nd maximum number is: " + Collections.max(nums));//7 is max number now but second max from  original numbers
        System.out.println("2nd minimum number is: " + Collections.min(nums));//1 is min number now but second min from  original numbers
        System.out.println("---------------------Task 6------------------");
        ArrayList<String> countries=new ArrayList<>(Arrays.asList("Ukraine","Great Britain","Bulgaria","Turkmenistan","Greece","Spain"));
        countries.removeIf(p->p.length()>10);
        System.out.println(countries);
        System.out.println("--------------------Task 7-------------------");
        ArrayList<String> str= new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        str.removeIf(p-> p.substring(0,1).equalsIgnoreCase(p.charAt(p.length()-1)+""));
        System.out.println(str);

        System.out.println("------------------Task 9---------------------");
        ArrayList<LocalDate> datesBefore=new ArrayList<>(Arrays.asList(LocalDate.of(2017,1,13),
                LocalDate.of(2015,1,3),LocalDate.of(2014,10,26)));
        datesBefore.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(datesBefore);





    }
}
