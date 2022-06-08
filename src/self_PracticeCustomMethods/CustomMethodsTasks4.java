package self_PracticeCustomMethods;


public class CustomMethodsTasks4 {
    public static void main(String[] args) {
        namedDay(8);
    }


    public static void namedDay (int number){

        String name  =" " ;

        switch (number){
            case 1 :
                name="Monday";
                break;
            case 2:
                name="Tuesday";
                break;
            case 3 :
                name = "Wednesday";
                break;
            case 4 :
                name = "Thursday";
                break;
            case 5 :
                name="Friday";
                break;
            case 6 :
                name="Saturday";
                break;
            case 7 :
                name="Sunday";
                break;
            default:
                name="Invalid number";
                break;

        }
        System.out.println(name);

    }


}
