package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {


       // for(int i=5; i<=10; i--){
       //     System.out.println("Hello Cydeo");
        //}

       // System.out.println("Hello World");

        for(int i = 10; i >5; i--){//i:10,9,8,7,6,5,4
           // System.out.println("Hello World"+i);//123456

        }

        System.out.println("-----------------------------------------------");
 int sum =0;
 for (int i =1 ; i<=100; i++){
 sum+=i;
}

        System.out.println("Sum is "+sum);



for(char i = 'A'; i <= 'Z' ; i++){

    System.out.print(i +" ");
}
        System.out.println();


        for(char i = 'Z'; i >= 'A' ; i--) {

            System.out.print( i + " ");
        }

    }
}
