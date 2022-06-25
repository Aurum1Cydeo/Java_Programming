package day26_statics.studentsTask;

public class TestObjects {
    public static void main(String[] args) {
        Student student1=new Student ("Yusuf",21,'M',"A16");
        Student student2=new Student ("Glenio",41,'M',"A132");
        Student student3=new Student ("Mehmet" ,31,'M',"A121");
        Student student4=new Student ("Helen",21,'F',"Y145");
        Student student5=new Student ("Mike",21,'M',"A116");

        Student[] students={student1,student2,student3,student4,student5};

       StudentsGroup group1=new StudentsGroup("Java Turtles",1) ;

       group1.addStudents("Khashayar",34,'M',"F34");
       group1.addStudents(students);
        System.out.println(group1);
        group1.removeStudent("A121");
        System.out.println(group1);
        group1.removeStudent("A16");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+ " : "+ each.id);
        }


    }
}
