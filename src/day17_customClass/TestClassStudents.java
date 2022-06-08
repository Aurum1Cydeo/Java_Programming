package day17_customClass;

public class TestClassStudents {
    public static void main(String[] args) {
    ClassStudent name1= new ClassStudent();
    name1.setInfo("Ann",25,"No 12367");

    ClassStudent name2=new ClassStudent();
    name2.setInfo("Emily",20,"No 23451");

    ClassStudent name3= new ClassStudent();
    name3.setInfo("Cathy",23,"No 23451");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

       name1.isStudent();

    }
}
