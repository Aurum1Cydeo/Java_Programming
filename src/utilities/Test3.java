package utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier{
    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();//if it's void we don't have to put sout
    }
}
