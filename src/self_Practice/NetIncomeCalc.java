package self_Practice;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 100000;
        //String salary ="";
        double taxRate = 0;
        boolean isMarried = true;
        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000){
        taxRate=0.3;
            //if the salary is between 100k to 135k (excluded) the tax rate should be 0.3
        }
        if (salary >=80000 && salary <100000){//if the salary is between 80k to 100k (excluded) the tax rate should be 0.25
            taxRate= 0.25;
        }
        if (salary<80000) {
            taxRate = 0.2;
        }

        if(isMarried){
            taxRate-=0.05;//tax reduced by 5%
        }

        double totalTax = salary * taxRate;//(1-taxRate);
        double netIncome = salary - totalTax;

        System.out.println( "salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


}

}