package self_PracticeCustomMethods;

public class CustomMethodsTask5 {
    public static void main(String[] args) {

month("ocToBer");

    }

    public static void month(String monthName){
        int numDays=0;

        monthName= monthName.substring(0,1).toUpperCase() + monthName.substring(1).toLowerCase();


        if(monthName.equals("January")) {
            numDays = 31;
        } else if (monthName.equals("February")) {
            numDays = 28;
        } else if (monthName.equals("March")) {
            numDays = 31;
        } else if (monthName.equals("April")) {
            numDays = 30;
        } else if (monthName.equals("May")) {
            numDays = 31;
        } else if (monthName.equals("June")) {
            numDays = 30;
        } else if (monthName.equals("July")) {
            numDays = 31;
        } else if (monthName.equals("August")) {
            numDays = 31;
        } else if (monthName.equals("September")) {
            numDays = 30;
        } else if (monthName.equals("October")) {
            numDays = 31;
        } else if (monthName.equals("November")) {
            numDays = 28;
        } else if (monthName.equals("December")) {
            numDays = 31;
        }else{

          numDays=0;
        }

        if (numDays!=0){
            System.out.println(monthName + " has "+ numDays+" days.");
        }else {
            System.out.println(monthName + " is wrong month.");
        }


    }


}
