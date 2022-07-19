package day34_abstraction.animal_Task;

public interface Playable {

    boolean  isFriendly= true;//static and final

   /* public static void main(String[] args) {
        System.out.println(isFriendly);
    }



     default void method1(){//becomes instance method in subclass

    }*/

    void play();//abstract


}
