package self_PracticeCustomMethods;

public class CustomMethodsTask6 {
    public static void main(String[] args) {

        eligibleToVote(14,true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        boolean isEligible;

        isEligible=(age>=18 && isAmerican==true)?true:false;

        if(isEligible){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

}

