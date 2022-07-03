package selfPracticeInheritance.bookTask;

import day17_customClass.Employee;

public class TestBook {
    public static void main(String[] args) {
        EBook eBook1 = new EBook("Kind Java", "Nonfiction", "Muhtar", 40, 'L', 200);
        System.out.println(eBook1);
        eBook1.readBook();

        AudioBook audioBook1 = new AudioBook("More Coding", "Fiction", "Ozzy", 45, 1.2, "Steven Spielberg");
        System.out.println(audioBook1);//

    }
}
