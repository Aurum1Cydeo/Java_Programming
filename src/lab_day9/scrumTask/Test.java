package lab_day9.scrumTask;

public class Test {
    public static void main(String[] args) {

        Tester name1 = new Tester("Daniel", 30, 'F', "A01", "QA", 40);

        System.out.println(name1);

        Developer developer1 = new Developer("Lorrain", 26, 'F', "C45", "Back-end developer", 45, "Java");
        System.out.println(developer1);

        developer1.coding();
        developer1.fixingBug();
    }
}
