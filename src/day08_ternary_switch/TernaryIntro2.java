package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number = 100;


       /* String result = " ";
        if (number >0){
            result = "Positive";
        }else if (number <0){
            result = "Negative"
        }else{
            result = "Zero";
        }*/


        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("-------------------------------------------------------------");



                int n = 2;

               /* String result="";

                if(number == 1 ){
                    result = "Monday";
                }
                if(number == 2){
                    result = "Tuesday";
                }
                if( number ==3){
                    result = "Wednesday";
                }
                if( number == 4){
                    result = "Thursday";
                }
                if ( number == 5){
                    result = "Friday";
                }
                if ( number == 6){
                    result = "Saturday";
                }
                if( number == 7){
                    result = "Sunday";
                }
                System.out.println(result);*

                 */

        String day = (n ==1 )? "Monday" : (n ==2 )? "Tuesday":(n ==4 )? "Wednesday" : (n ==4 )?"Thursday":(n ==5 )? "Friday"
                :(n==6)?"Saturday" : "Sunday";


        System.out.println(day);

        int num = 10;//1~12

        String month;






    }
    }
