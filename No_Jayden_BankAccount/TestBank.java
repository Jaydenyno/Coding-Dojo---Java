import java.util.ArrayList;
import java.util.Arrays;
public class TestBank {
    public static void main(String[] args) {
        BankAccount accountTest = new BankAccount();

        System.out.println("----- getCheckingBalance Test -----");
        accountTest.getCheckingBalance();

        System.out.println("----- getSavingBalance Test -----");
        accountTest.getSavingBalance();

        System.out.println("----- deposit/withdraw Test -----");
        accountTest.checkingDeposit(50);
        accountTest.savingDeposit(100);
        accountTest.checkingWithdraw(10);
        accountTest.savingWithdraw(10);
        accountTest.getCheckingBalance();
        accountTest.getSavingBalance();

        // System.out.println("----- deposit/withdraw Test -----");
        // System.out.println("Please enter checking or saving");
        // String type = System.console().readLine();
        // System.out.println("Please enter deposit or withdraw");
        // String choice = System.console().readLine();
        // if (choice == "deposit") {
        //     System.out.println("Please enter the amount you want to deposit");
        //     Double amount = Double.parseDouble(System.console().readLine());
        //     accountTest.deposit(type, amount);
        // } else if (choice == "withdraw") {
        //     System.out.println("Please enter the amount you want to withdraw");
        //     Double amount = Double.parseDouble(System.console().readLine());
        //     accountTest.withdraw(type, amount);
        // }

        System.out.println("----- getCheckingBalance END -----");
        accountTest.getCheckingBalance();

        System.out.println("----- getSavingBalance END -----");
        accountTest.getSavingBalance();
        System.out.println("----- totalBalance Test -----");
        System.out.println("Total balance is " + accountTest.totalBalance());
    }
}