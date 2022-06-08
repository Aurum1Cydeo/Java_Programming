package lab_day7;

public class TestCydeoObjects {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1=new CydeoStudent();
        cydeoStudent1.setInfo("Naran",30,'M',true,true,"Java Developer batch1","Java",2);
        System.out.println(cydeoStudent1);

        CydeoStudent cydeoStudent2=new CydeoStudent();
        cydeoStudent2.setInfo("Vasyl",30,'M',true,true,"Java Developer batch2","Java",3);
        System.out.println(cydeoStudent2);

        CydeoStudent cydeoStudent3=new CydeoStudent();
        cydeoStudent3.setInfo("Daniel",28,'M',true,true,"SDET batch2","Java",3);
        System.out.println(cydeoStudent3);

        System.out.println("--------------------------------");

        CydeoStudent student1=new CydeoStudent();
        CydeoStudent student2=student1;
        CydeoStudent student3=student2;

        student1.setInfo("Naran",30,'M',true,true,"Java Developer batch1","Java",2);

       student3.age=35;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);




    }
}
