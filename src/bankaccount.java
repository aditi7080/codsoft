import java.util.Scanner;

public class bankaccount implements user{
    double balance;
    @Override
    public void withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Sorry you do not have enough balance for money withdrawal");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw amount: " + amount + "and total balance after withdrwal: " + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        balance=amount +balance;
        System.out.println("Deposit amount: "+amount+ " and total balance after deposit: "+balance);

    }

    @Override
    public void checkbalance() {
        System.out.println("Balance is: "+balance);
    }
}
