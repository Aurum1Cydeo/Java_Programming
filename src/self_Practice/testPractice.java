package self_Practice;


public class testPractice {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int j = 1;
            while (j <= i) {
                System.out.println(j + " ");
                j++;
            }
        }
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Cydeo ");
                if (j == 3) {
                    break outer;
                }
            }

        }

        balance();

    }


    public static int balance() {
        int balance = 10;

        while (true) {
            if (balance < 9) {
                break;
            }
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance);

        return balance;
    }


}
