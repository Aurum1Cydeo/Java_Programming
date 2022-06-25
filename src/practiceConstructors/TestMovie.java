package practiceConstructors;

import java.time.LocalDate;

public class TestMovie {
    public static void main(String[] args) {
        Movie movie1=new Movie("USA","Batman","Me", LocalDate.of(2021,03,12));
        String [] str={"Brad Pitt","Jennifer Anniston"};
        movie1.addCasts(str);

        movie1.addCast("James Bond");//ArrayList<String> casts
        movie1.addCast("JLO");

        System.out.println(movie1.addCasts(str));
        System.out.println("----------------");
        System.out.println(movie1);
    }
}
