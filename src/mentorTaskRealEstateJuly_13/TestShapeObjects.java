package mentorTaskRealEstateJuly_13;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShapeObjects {
    public static void main(String[] args) {
        ArrayList<House> house=new ArrayList<>(Arrays.asList( new SquareHouse("Square",20),
                new SquareHouse("Square",25),
                new SquareHouse("Square",30),
                new RectangularHouse("Rectangular",20,30)));


        System.out.println(filterProperties(house, 600));

    }

    public static  ArrayList <House> filterProperties(ArrayList<House> list,int minArea ){
        ArrayList<House> result=new ArrayList<>();
        for (House each : list) {
            if(each.area()>=minArea){
                result.add(each);
            }
        }



       return result;
    }
}
