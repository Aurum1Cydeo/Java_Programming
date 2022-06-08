package day06_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int monthNumber = 10;

        String result = "";

        if( monthNumber == 1){
            result = "January";
        }

        if( monthNumber == 2){
            result = "February";
        }
        if( monthNumber == 3){
            result = "March";
        }
        if ( monthNumber==4){
            result = "April";
        }
        if (monthNumber==5){
           result = "May";
        }
        if(monthNumber==6){
            result = "June";
        }
        if(monthNumber==7){
          result = "July";
        }
        if (monthNumber==8){
            result= "August";
        }
        if (monthNumber==9){
            result = "September";
        }
        if(monthNumber==10){
            result = "October";
        }
        if(monthNumber==11){
           result= "November";
        }
        if(monthNumber==12){
           result = "December";
        }

        System.out.println(result);



    }


}
