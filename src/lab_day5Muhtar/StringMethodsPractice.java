package lab_day5Muhtar;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String name2="Cydeo School";
        String name="Josh Daniel";
        //           0123456789..
       char ch= name.charAt(5);

       System.out.println(ch);
        System.out.println(name.length());

       char lastChar=name.charAt(name.length()-1);//length give the number of characters but if we need to find
        // last index  of character we need to subtract 1
        System.out.println(lastChar);

        System.out.println("--------------------------------------------");

        String school="Cydeo School";

        int index1= school.indexOf('e');
        System.out.println(index1);
        int index2=school.indexOf('j');
        System.out.println(index2);


        String str1="Java Programming Language";

        int index3= str1.indexOf("a ");
        System.out.println(index3);
        System.out.println("-----------------------------------------");

        String s1 = "WOODEN SPOON";
        s1=s1.toLowerCase();

        s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
        System.out.println(s1);

        String sentence="Today is Thursday,and Thursday is a lab day";

       sentence= sentence.replace("Thursday","Friday");

       System.out.println(sentence);

       String s="Today is Thursday,and Thursday is a lab day";

       s=s.replaceFirst("Thursday","Wednesday");

        System.out.println("--------------Substring---------------------");

        String email="cydeo_school@gmail.com";

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain is: "+domain);

       // int beginningIndex=email.indexOf('@'+1);
        //int endingIndex=email.lastIndexOf('.');

       String domain2=email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));

       // String domain2=email.substring(beginningIndex+endingIndex);

        System.out.println(domain2);

        String s2 ="I study at CYDEO";
        String schoolName=s2.substring(s2.indexOf('C'));
        System.out.println("School name: "+schoolName);


        System.out.println("------------------equals/equalsIgnoreCase method-------------------");

        String a1="DOG";
        String a2="dog";

        System.out.println(a1.equals(a2));//false
        System.out.println(a1.equalsIgnoreCase(a2));//true
        System.out.println("------------------contains method-----------------------");
        String s3="Java is my favorite programming language";

        System.out.println(s3.equals("Java"));
        System.out.println(s3.contains("Java"));

        System.out.println("---------------startsWith method------------------");
        String w="Cydeo School";
        System.out.println(w.startsWith("Cydeo"));

        System.out.println(w.endsWith("ool"));



    }
}
