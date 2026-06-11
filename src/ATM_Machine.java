import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        bankaccount acc = new bankaccount();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your balance: ");
        Scanner input2 = new Scanner(System.in);
        int balance = input2.nextInt();
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("Enter your choice: ");
        int choice=input.nextInt();

        switch(choice){
                case 1:
                     System.out.println("Enter amount to withdraw: ");
                      double amount = input.nextDouble();
                       acc.withdraw(amount);
                        break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depo= input.nextDouble();
                    acc.withdraw(depo);
                    break;
                case 3:
                        acc.checkbalance();
                        break;
                default:
                System.out.println("Invalid choice");
        }

    }


}
