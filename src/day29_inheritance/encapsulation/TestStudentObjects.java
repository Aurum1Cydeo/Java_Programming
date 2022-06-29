package day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Hasan", 30, 'M', 'A', "MIT");

        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println(student1);
    }
}
