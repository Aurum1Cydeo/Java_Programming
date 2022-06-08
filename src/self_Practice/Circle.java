package self_Practice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double pi = 3.14;
        double area = radius*radius*pi;//A = \pi r^2
        double perimeter = 2*pi*radius;//C=2πr
        System.out.println("The circle area = "+ area);
        System.out.println("The perimeter = " + perimeter);

        input.close();


    }
}
