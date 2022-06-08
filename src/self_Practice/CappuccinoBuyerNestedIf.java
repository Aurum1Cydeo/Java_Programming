package self_Practice;

public class CappuccinoBuyerNestedIf {
    public static void main(String[] args) {



       String cupSize = "grande";
       double price = 0.00;
       int calories = 0;

       String result = "";

       if (cupSize == "tall" || cupSize== "grande" || cupSize == "venti" ) {
           if (cupSize == "tall") {
               price = 3.00;
               calories = 90;
           }
        if (cupSize== "grande") {
            price = 3.99;
            calories = 120;

        }
            if (cupSize == "venti"){
                price = 4.29;
                calories = 150;
            }

       }
       else result = "Invalid Size";
        System.out.println("price is $" + price + " /calories = "+calories);



/*
. Create a class called  CappuccinoBuyer. A variable named Size is given,+
 write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
 */












    }
}
