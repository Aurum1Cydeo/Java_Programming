package mentorTasks;

import java.util.ArrayList;

public class PracticeArrays {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int evenCount = 0;
        int oddCount = 0;

        for (int each : array) {

            if (each % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount = " + evenCount);


        ArrayList<String> foodList= new ArrayList<>();
        foodList.add("pizza");
        foodList.add("Hotdog");
        foodList.add("dumplings");
        foodList.size();
        System.out.println(foodList.size());
    }
}
