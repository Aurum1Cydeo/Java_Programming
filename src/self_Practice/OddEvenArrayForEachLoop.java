package self_Practice;

public class OddEvenArrayForEachLoop {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int odd = 0;
        int even = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);


    }

}