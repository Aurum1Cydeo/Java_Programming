package day17_customClass;

public class Car {


    public String make;
    public String model;
    public int year;
    public String bodyStyle;
    public String color;
    public int miles;
    public double price;

    public void  setInfo (String make, String model, int year, String bodyStyle, String color, int miles, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.color = color;
        this.miles = miles;
        this.price = price;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }

    public void availability(){
            System.out.println(make+" "+model + " is available");

    }
}
