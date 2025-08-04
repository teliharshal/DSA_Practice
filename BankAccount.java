import java.util.Scanner;

class Account {
    double accountBal;

    public Account(){
        this.accountBal=0;
    }

    public void deposite(double ammount) {
        if (ammount > 0) {
            accountBal = accountBal + ammount;
            System.out.println(accountBal);
        }else {
            System.out.println("Not Sufficient Balance To add");
        }
    }

    public void withDraw(double withdrawAmount){
        if(withdrawAmount < 0){
            System.out.println("Amout Can't WithDraw");
        } else if (accountBal == 0) {
            System.out.println("Insufficient Balance");
        } else if (withdrawAmount > accountBal) {
            System.out.println("Insuffient Balance can't Withdraw");
        }else {
            accountBal -= withdrawAmount;
        }
    }

    public double checkBal(){
        System.out.println("Final Account Bal"  + " " + accountBal);
        return accountBal;
    }

}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();


        while (true) {
            System.out.println("Choose Option---");
            System.out.println("\n1  deposite  \n2 withdraw  \n3 Check Balance  \n4 Exit ");
            int Choice =sc.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter Amount To Deposite");
                    double deposite=sc.nextDouble();
                    ac.deposite(deposite);
                    System.out.println("Deposited Amount Is"+ " " +deposite);
                    break;
                case 2:
                    System.out.println("Enter Withdraw Amount");
                    double withdraw = sc.nextDouble();
                    ac.withDraw(withdraw);
                    System.out.println("Withdraw Amount is " + " " + withdraw);
                    break;
                case 3:
                    ac.checkBal();
                    break;
                case 4:
                    System.out.println("Existing---");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}
