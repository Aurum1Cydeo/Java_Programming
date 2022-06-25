package self_Practice;

public class nineDimensionalArray {
    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] arr0 : array) {
            for (String[][][][][][][][] arr1: arr0) {
                for (String[][][][][][][] arr2 : arr1) {
                    for (String[][][][][][] arr3 : arr2) {
                        for (String[][][][][] arr4 : arr3) {
                            for (String[][][][] arr5 : arr4) {
                                for (String[][][] arr6 : arr5) {
                                    for (String[][] arr7 : arr6) {
                                        for (String[] arr8 : arr7) {
                                            for (String sentence : arr8) {
                                                System.out.print(sentence+"\t");
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
