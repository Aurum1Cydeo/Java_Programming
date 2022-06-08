package day17_customClass;

public class TestRectangle {
    public static void main(String[] args) {


        Rectangle rectangle1= new Rectangle();
        rectangle1.setInfo(20,10.5);

        System.out.println(rectangle1);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();


    }
}
