package practiceConstructors;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza("small",3,2);
        System.out.println(pizza1);
        Pizza pizza2= new Pizza("Large",2,3);
        System.out.println(pizza2);
        pizza2.numberOfPepperoniTopping=1;
        pizza2.size="medium";
        System.out.println(pizza2);

    }
}
