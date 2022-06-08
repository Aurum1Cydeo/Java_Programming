package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye",28,'F',"Java Developer",95000,"A12");

        Employee employee2=new Employee();
        employee2.setInfo("Qadir",35,'M',"Java Developer",120000,"Id5677");

        Employee employee3=new Employee();
        employee3.setInfo("Dilara",35,'F',"Back-end Developer",100000,"Id566");

        employee2.age=39;
        employee3.name="Luck";
        employee3.gender='M';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);




        employee3.work();

    }
}
