package mentorTaskRealEstateJuly_13;

public class CircleHouse extends House {
private double radius;

    public CircleHouse(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

}
