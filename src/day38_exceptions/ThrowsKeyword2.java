package day38_exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

    }

    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);
    }

    public static void method1(){
        System.out.println("Hello world");
        try {
            pauseFor5Seconds();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world");
    }


}
