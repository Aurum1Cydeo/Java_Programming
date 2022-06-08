package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i = 10;i <21; i++) {

            if (i%2==0){
                continue;//skips the current iteration
            }
            System.out.println(i);
        }
        System.out.println("----------------------A------------------------");

        for(char i = 'A'; i <='G';i++) {// i:A, B, C, D, E, F, G

            if (i == 'B' || i == 'E') {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("---------------------------------------------------");

        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){ // if the i's value is odd number
                continue; // skip it
            }

            System.out.print(i+" ");

        }

        System.out.println();

//----------------------------------------------------------------

        //50, 52, 54, 56 ...... 100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i+" ");
        }

        System.out.println();

//--------------------------------------------------------------------------
// find the sum of all the even number between 50 ~ 100

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }

        System.out.println();

     /*   for(int i = 0; i<10; i++) {
            System.out.println("Hello world");
        }
        */
    }
}
