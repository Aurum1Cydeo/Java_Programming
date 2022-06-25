package day27_accessModifiers;

public class AccessModifiers {
    public static int publicData=200;
protected static int protectedData=300;

static int defaultModifier =400;

private static int privateData=500;


    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultModifier);
        System.out.println(privateData);
    }


}
