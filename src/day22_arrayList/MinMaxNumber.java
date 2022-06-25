package day22_arrayList;

public class MinMaxNumber {
    public static void main(String[] args) {

        //index of elements 0  1  2     0   1   2     0   1  2
       int[][] array = { {100,20,300},{10,1000,50},{-200,400,0} };//length of this array is 3: 0,1,2
       // index of 1D array    0            1            2


       int max = array[0][0];
       int min=array[0][0];
        for (int[] each1D : array) {
            for (int eachElement : each1D) {
                if(max<eachElement){
                    max=eachElement;
                }
                if(eachElement<min){
                    min=eachElement;
                }
            }
        }

        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);


    }
}
