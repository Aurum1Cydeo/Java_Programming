package mentorTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumberHomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> largestNumber = new ArrayList<>();

        largestNumber.addAll(Arrays.asList(7, 2, 8, 4, 5, 6, 7, 3, 1, 8 ));
        ArrayList <Integer> nonDup = new ArrayList<>();
        int n=3;
        for (Integer each : largestNumber) {
            if(nonDup.contains(each)){

                continue;
            }
            nonDup.add(each);
        }
        Collections.sort(nonDup);

        System.out.println(nonDup);

        System.out.println(nonDup.get(nonDup.size()-n));

    }
}
