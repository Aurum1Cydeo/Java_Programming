package lab_day6presentation_slides;

public class CustomMethodsPractice4 {
    public static void main(String[] args) {


        String str="aaaaaabcccdeeef";//"bdf"
String unique="";
        for (int i = 0; i < str.length(); i++) {
           /* char each = str.charAt(i);

            int f = StringUtilities.frequency(str, str.charAt(0));

            if(f==1){
                unique+=each;
            }
*/
            if( StringUtilities.frequency(str, str.charAt(i))==1){
                unique+=str.charAt(i);
            }
        }
        System.out.println(unique);
        System.out.println("--------------------------");

        String s ="aaabbc";//a3b2c1

        String nonDup= StringUtilities.removeDupl(s);//a b c
        String result="";
        for (int i = 0; i < nonDup.length(); i++) {
            char ch= nonDup.charAt(i);//            a b c
            int f=StringUtilities.frequency(s,ch);//3 2 1
            result+=""+ch+f;

            //result += ""+nonDup.charAt(i) + StringUtility.frequency(s, nonDup.charAt(i)) ; whole code in 1 line
        }
        System.out.println(result);


    }
}
