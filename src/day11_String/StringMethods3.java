package day11_String;

public class StringMethods3 {
    public static void main(String[] args) {
//isEmpty() method
        String word = "Wooden Spoon";

        boolean r1 = word.isEmpty();
        System.out.println(r1);
//isBlank() method

        String str = "        ";
        boolean r2 = str.isEmpty();
        boolean r3=str.isBlank();
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
//equals()

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1==str2);// always falls
        System.out.println(str1.equals(str2));

        String str3= new String("cydeo");

        System.out.println(str2.equals(str3));
//equalsIgnoreCase()

        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

//contains

        //yes.Yes yEs,YeS===>yes

        String students = "Hasan Naran Sumeye Nataliia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);
        boolean hasNataliia = students.contains("Nataliia");
        System.out.println("Has Nataliia = " +hasNataliia);
        String sentence = "My favorite programming language is JAVA";

        boolean hasJava= sentence.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);
//startsWith() &&endsWith()

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println(l);

       // boolean isValid = url.startsWith("www.");

      //  boolean t = url.endswith(".com");

String email = "CydeoSchool@gmail.com";
boolean isGmail = email.endsWith("gmail.com");
boolean isYahoo = email.endsWith("yahoo.com");
boolean isHotmail= email.endsWith("hotmail.com");



    }
}
