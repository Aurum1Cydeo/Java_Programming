package self_Practice;

public class Loans {
    public static void main(String[] args) {
        int salary= 61000;
        int creditScore=560;
        String result;
        boolean loanApproved;

        result = (salary>60000 && creditScore >650) ? "Loan Approved" : "Loan Denied";

        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

        loanApproved = (salary > 60000 && creditScore > 650) ? true: false;

        System.out.println((loanApproved == true) ? "Loan approved" : "Loan Denied");

        /*
        2. Create a class called Loans, Given two variables salary and credit score, use those given info to
         determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650

        Otherwise print: "Loan Denied"

        NOTE: MUST USE TERNARY.*/




    }
}

