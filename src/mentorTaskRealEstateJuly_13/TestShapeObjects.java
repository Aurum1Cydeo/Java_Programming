package mentorTaskRealEstateJuly_13;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShapeObjects {
    public static void main(String[] args) {
        ArrayList<House> house = new ArrayList<>(Arrays.asList(
                new SquareHouse("Square1", 20),
                new SquareHouse("Square2", 25),
                new SquareHouse("Square3", 30),
                new RectangularHouse("Rectangular1", 20, 30),
                new RectangularHouse("Rectangular2", 20, 25),
                new CircleHouse("Circle1", 15),
                new CircleHouse("Circle2", 20),
                new CircleHouse("Circle3", 25)));

        System.out.println(filterProperties(house, 600));
        System.out.println(filterProperties(house,700));

    }

    public static ArrayList<House> filterProperties(ArrayList<House> list, int minArea) {
        ArrayList<House> result = new ArrayList<>();
        for (House each : list) {
            if (each.area() >= minArea) {
                result.add(each);
            }
        }


        return result;
    }
}
