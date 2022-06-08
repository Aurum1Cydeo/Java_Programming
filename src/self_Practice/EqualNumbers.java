package self_Practice;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1= 6,
                n2=9,
                n3=8;
        String equality = "";
        if (n1 == n2 && n2 == n3 && n1 == n3){
            equality = "all equal";
        }
        if (n1 == n2 && n2 != n3) {
            equality = "n1&n2 are equal";
        }
        if (n2 == n3 && n1 != 3){
            equality = "n2&n3 are equal";
        }
        if (n3 == n1 && n1!=2){
            equality = "n3&n1 are equal";
        }
        if (n1 != n2 && n1 != n3 && n3 != n2){
            equality = "none of then are equal";
        }
        System.out.println(equality);
    }
}
