package day08_ternary_switch;

public class MonthNameTernary {
    public static void main(String[] args) {


        int monthNumber = 6; //the number of month  1~12

        String month = ( monthNumber == 1) ? "January":( monthNumber == 2)? "February":( monthNumber == 3)?"March"
                :( monthNumber==4)?"April": (monthNumber==5) ? "May" : (monthNumber==6)?"June": (monthNumber==7)?
                "July":(monthNumber==8)?"August": (monthNumber==9)?"September":(monthNumber==10)?"October":(monthNumber==11)?
                "November":"December";
        System.out.println(month);







        /* if( monthNumber == 1){
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

        System.out.println(result);*/













    }
}
