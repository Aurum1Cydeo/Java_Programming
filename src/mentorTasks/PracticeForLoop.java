package mentorTasks;

public class PracticeForLoop {
    public static void main(String[] args) {
        String str ="Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday";
         String [] arr=str.split(",");

for(int i = 1; i<5;i++){
    System.out.println("Week: "+i);

    for (String weekdays : arr) {//
        System.out.println("\t"+weekdays);
    }


}
     /*
Task-1: Write a function that has an output like below.

Week: 1
  Monday
  Tuesday
  Wednesday
  .....
  Sunday
Week: 2
  Monday
  Tuesday
  Wednesday
  .....
  Sunday
Week: 3
  .....
Week: 4
  .....
 */


    }
}
