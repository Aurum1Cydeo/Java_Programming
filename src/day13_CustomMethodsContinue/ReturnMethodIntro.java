package day13_CustomMethodsContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {
       // int total = sum(20,40);//sum is a void method
square(10);//
        System.out.println(square(10));//or assign to a variable
        System.out.println(cube(5));//or assign to a variable int r=cube(cube(n))

    }

  /*  public static void sum(int n1,int n2){
        int result = n1+n2;*/

public static int addition(int n1,int n2){

    return n1+n2;//or int result = n1+n2; return result;
}


public static int square (int num){
    int square = num*num;
    return square;
}
public static int cube(int num){
    int cube = square(num)*num;
    return cube;
}


}


