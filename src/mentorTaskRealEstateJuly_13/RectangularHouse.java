package mentorTaskRealEstateJuly_13;

public class RectangularHouse extends House {

    private double side,width;

    public RectangularHouse(String name, double side, double width) {
        super(name);
        this.side = side;
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {

        return side*width;
    }


}
