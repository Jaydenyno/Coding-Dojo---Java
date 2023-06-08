import java.util.ArrayList;
import java.util.Arrays;
public class BankAccount {

    private double checkingBalance;
    private double savingBalance;
    private static int numAccounts = 0;
    private static double moneyStored;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingBalance = 0;
        numAccounts++;
        this.moneyStored = this.checkingBalance + this.savingBalance;
    }

    public void getCheckingBalance() {
        System.out.println("remaining balance for checking account is " + checkingBalance);
    }
    public void getSavingBalance() {
        System.out.println("remaining balance for saving account is " + savingBalance);
    }
    
    public void  checkingDeposit(double deposit) {
        this.checkingBalance += deposit;
    }

    public void checkingWithdraw(double withdraw) {
        this.checkingBalance -= withdraw;
    }

    public void  savingDeposit(double deposit) {
        this.savingBalance += deposit;
    }

    public void savingWithdraw(double withdraw) {
        this.savingBalance -= withdraw;
    }

    public void deposit(String type, double deposit) {
        double totalAmount = 0; 
        if (type == "checking") {
            totalAmount = this.checkingBalance + deposit;
            System.out.println(deposit + "$ has been added to your checking account.");
            System.out.println("Total checking balance is " + totalAmount + ".");
            this.checkingBalance += deposit;
        } else {
            totalAmount = this.savingBalance + deposit;
            System.out.println(deposit + "$ has been added to your saving account.");
            System.out.println("Total saving balance is " + totalAmount + ".");
            this.savingBalance += deposit;
        }
    }

    // public void withdraw(String type, double withdraw) {
    //     double totalAmount = 0;
    //     if (type == "checking") {
    //         if ((this.checkingBalance - withdraw) < 0) {
    //             System.out.println("Insufficient fund");
    //         } else {
    //             totalAmount = this.checkingBalance - withdraw;
    //             System.out.println(withdraw + "$ has been deducted from your checking account.");
    //             System.out.println("Total checking balance is " + totalAmount + ".");
    //             this.checkingBalance -= withdraw;
    //         }
    //     }
    //     if (type == "saving") {
    //         if ((savingBalance - withdraw) < 0) {
    //             System.out.println("Insufficient fund");
    //         } else {
    //             totalAmount = this.savingBalance - withdraw;
    //             System.out.println(withdraw + "$ has been deducted from your saving account.");
    //             System.out.println("Total saving balance is " + totalAmount + ".");
    //             this.savingBalance -= withdraw;
    //         }
    //     }
    // }   


    public double totalBalance() {
        return this.checkingBalance + this.savingBalance;
    }

}