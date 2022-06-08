package day16_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition= false;

        for(;condition;){
            System.out.println("Hello Cydeo ------For loop ");//won't be executed
        }
        System.out.println("-----------------------------------------------");

        while ( condition){
            System.out.println(" Hello Cydeo -------- While loop ");//won't be executed
        }

        System.out.println("__________________________________________________");
do {
    System.out.println("Hello Cydeo ------------Do & While loop ");

}while (condition);



    }
}
