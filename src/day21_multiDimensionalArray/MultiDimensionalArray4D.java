package day21_multiDimensionalArray;

public class MultiDimensionalArray4D {
    public static void main(String[] args) {
        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{10, 11, 12}} };
        int[][][] arr3D2 = { {{11,22}, {23, 24, 25}} ,  {{26, 27, 28, 29},{22, 23, 24}} };
        int[][][] arr3D3 = { {{31,32}, {33, 34, 35}} ,  {{36, 37, 38, 39},{32, 33, 34}} };

        int[][][][] arr4D = {   arr3D1, arr3D2, arr3D3};


        for (int[][][] each3D : arr4D) {

            for (int[][] each2D : each3D) {

                for (int[] each1D : each2D) {

                    for (int eachElement : each1D) {
                        System.out.println(eachElement);

                    }
                }
            }
        }


    }
}
