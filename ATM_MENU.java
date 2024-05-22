package ATM;
import java.util.*;
public class ATM_MENU {
   private double balance;



public ATM_MENU(double totalbalance){
    this.balance = totalbalance;

}
 public void ATMMENU(){
     System.out.println("ATM Menu");
     System.out.println("1. Check Account Balance");
     System.out.println("2. Withdraw");
     System.out.println("3. Deposit Amount");
     System.out.println("4. Exit");
 }
  public void selectoption(int option){
     if (option ==1){
         checkAccountBalance();
     }
     else if (option == 2){
         withdraw();
     }
     else if (option == 3){
         depositAmount();
     }
     else if (option == 4){
          System.out.println("Exit");
          System.exit(0);
      }
      else {
          System.out.println("invalid option");
      }

  }
  public void checkAccountBalance(){
    System.out.println("current balance ="+ balance);

  }
    private void withdraw() {
        Scanner scobj = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: Rs");
        double amount = scobj.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal  is successful, Your Remaining balance: Rs" + balance);
        }
    }
    private void depositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: Rs");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. Current balance: Rs" + balance);
    }
}


