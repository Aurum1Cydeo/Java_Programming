package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
//                      0  1   2  3  4
        //              0  2   4  6  8

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]*2);
        }
        System.out.println("-------For--Each--Loop");

        for (int each : numbers){//"numbers"-data structure
            System.out.println(each);

           // System.out.println("---------disadvantage of For Each Loop--------");

            //you can't change the order of iteration order and number of elements



        }
    }
}
