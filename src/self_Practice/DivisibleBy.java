package self_Practice;

public class DivisibleBy {
    public static void main(String[] args) {
        int number=100;
       String divisibleBy15="";
       String divisibleBy5="";
       String divisibleBy3="";

       for (int i=1; i<=number ; i++){
           if((i%3==0) && (i%5==0)){
             divisibleBy15 +=i+" ";
           }else if (i%3==0){
               divisibleBy3+=i+" ";
           }else if (i % 5==0){
               divisibleBy5+=i+" ";
           }

       }

        System.out.println("Divisible by 15: "+divisibleBy15);
        System.out.println("Divisible by 5: "+divisibleBy5);
        System.out.println("Divisible by 3: "+divisibleBy3);
    }
}
