package day17_customClass;

public class Rectangle {

     public double length;
     public double width;


     public void setInfo (double length, double width) {
        this.length = length;
        this.width = width;

    }

     public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public void calculateArea(){
            System.out.println("Area is: " + length*width);
        }

        public void calculatePerimeter(){
            System.out.println("Perimeter is: "+ 2*(length+width));
        }

    }

