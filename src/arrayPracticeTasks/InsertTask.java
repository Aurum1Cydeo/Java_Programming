package arrayPracticeTasks;

public class InsertTask {
    public static void main(String[] args) {

     String str="abcdeb";
     int repeats=0;
     for( int i=0; i<str.length();i++){
         if(str.charAt(i)==i){
             repeats++;

         }

     }
        System.out.println("repeats = " + repeats);


    }
}
