package practiceConstructors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Movie {
    public String country,title,Genre,director;
    public LocalDate releaseDate;
    public ArrayList <String> casts=new ArrayList<>();

    public Movie(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }


    public void  addCast(String cast){//String cast="Brad Pitt";
        casts.add(cast);

    }
    public ArrayList<String> addCasts(String[] str){//String [] str={"Brad Pitt","Jennifer Anniston",..}
        casts.addAll(Arrays.asList(str));
        return casts;//
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", release date =" + releaseDate +
                ", number of casts=" + casts.size() +
                '}';
    }
    /*
    Task03:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

     */
}
