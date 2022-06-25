package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String [] group1={"Dilara","Julia","Burulai","Qadir"};//4
        String [] group2={"Yasin","Cemil","Khashayar"};//3
        String [] group3={"James","Daniel","Diana","Alena","Anna"};//5
        String [] group4={"Mohamed","Madiyar"};//2

        String[][] groups={group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
          String[]eachGroup=  groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent=eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println("---------------------------------");
        for (int i = groups.length-1; i >= 0; i--) {
           String [] eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println(Arrays.deepToString(groups));//to print multi dimensional array use deepToString method
    }
}
