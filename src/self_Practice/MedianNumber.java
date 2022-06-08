package self_Practice;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 30,
        b= 45,
        c=34;
        String result ="";


       if( a > b && a < c); {
            result = a + " is median number";
        }
        if ( b > a && b < c ){
            result = b + " is median number";
        }
        if (c >a && c < b ){
            result = c + " is median number";
        }
        System.out.println( result );

    }
}
