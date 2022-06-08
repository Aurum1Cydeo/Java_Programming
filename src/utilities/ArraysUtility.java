package utilities;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];//to make sure 3rd array has enough capacity to contain all the elements

        int k = 0;//for 3 array`s index number

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array`s index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        // arr3[0] = arr1[0]
        // arr3[1] = arr1[1]
        // arr3[2] = arr2[2]
        //   k=3      i=3


        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        // k = 3       i = 0
        // arr3[3] = arr2[0]
        // arr3[4] = arr2[1]

        return arr3;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}