package self_PracticeCustomMethods;

public class CustomMethodsTask7 {
    public static void main(String[] args) {
salary(45,40);
    }

    public static void salary(double hourlyRate, int weeklyHours){

        double grossIncome;
        grossIncome= hourlyRate*weeklyHours*52;
        System.out.println("You make $"+hourlyRate+ " per hour");
        System.out.println("You work "+weeklyHours+" hours in a week");
        System.out.println("Your gross income is $"+ grossIncome);



    }

}
