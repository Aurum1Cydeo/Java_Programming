package day18_GarbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){

        System.out.println("Your available balance is: $"+balance);

    }

    public void deposit(double amount){
        if(amount<1){
            System.out.println("Insufficient amount: "+amount);
            return;
        }
        System.out.println("Depositing $"+amount+ " to " +accountNumber);
        balance+=amount;
    }

   public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient amount: "+amount);
            return;}
           /* if(amount >1000){
               System.out.println("Limit withdrawing amount. Call your bank to increase your limit");
             */
       System.out.println("Withdrawing $"+amount+" from "+accountNumber);
        balance-=amount;

   }
}

/*
Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
            	2. toString(): displays the full account info
                3. checkBalance():displays the available balance
                4. deposit(amount): increases the balance by the specified amount
        	5. withdraw(amount): decreases the balance by the specified amount
 */