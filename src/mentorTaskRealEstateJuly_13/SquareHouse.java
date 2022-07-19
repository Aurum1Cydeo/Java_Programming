package mentorTaskRealEstateJuly_13;

public class SquareHouse extends House {
    private double side;

    public SquareHouse(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {

        return side*side;
    }


}



