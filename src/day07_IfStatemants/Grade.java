package day07_IfStatemants;

public class Grade {
    public static void main(String[] args) {

        char grade = 'C';
        String result = "";
            if (grade == 'A') {
            result = "Excelent";
        }
            if (grade == 'B') {
                result = " Great job";
                if (grade == 'C') {
                    result = "Good";
                }
                if (grade == 'D') {
                    result = "Passed";
                    if (grade == 'F') {
                        result = "Failed";
                    }
                }
            }
        System.out.println(result);
    }


}
//2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
//            'A': Excellent
//            'B': Great job
//            'C': Good
//            'D': Passed
//            'F': Failed
//
//        Note: Do not use more than one print statement