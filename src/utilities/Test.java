package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class Test {
    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method2();

        System.out.println("------------------------------");

        System.out.println(AccessModifiers.publicData);//public is always accessible in different packages
        //System.out.println(AccessModifiers.protectedData);//protected is NOT always accessible in different packages
       // System.out.println(AccessModifiers.defaultDate); default is Never accessible in different packages
        //System.out.println(AccessModifiers.privateData);default is Never accessible in different packages
    }
}
