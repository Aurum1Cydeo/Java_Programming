package self_Practice;

public class OxygenTank {
    public static void main(String[] args) {
        int level= 88;
        String  oxygenLevel = "";
        if (level >= 90 ){
            oxygenLevel = "Your tank is full";
        }
        if (level >=80 && level<90) {
            oxygenLevel = "Still okay";
        }
        if (level >=70 && level<80){
            oxygenLevel = "Don't go to far";
        }
        if (level >=60 && level<70){
            oxygenLevel ="Start to head back";
        }
        if (level >=50 && level<60){
            oxygenLevel = "Be careful now you at at 50%";
        }
        System.out.println(oxygenLevel);

    }
}
