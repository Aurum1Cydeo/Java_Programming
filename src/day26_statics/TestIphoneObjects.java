package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {
        Iphone iPhone=new Iphone("Iphone12","Black",1000);
        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(Iphone.brand);//"Iphone" class name. call static variables through Class name only
        System.out.println(Iphone.OS);




    }
}
