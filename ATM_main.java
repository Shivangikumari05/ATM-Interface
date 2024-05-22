package ATM;
import java.util.*;
public class ATM_main {
    public static void main(String[] args){
        double totalbalance =2000;
        ATM_MENU ATM=new ATM_MENU(totalbalance);
        Scanner sc= new Scanner(System.in);
        while (1==1){
            ATM.ATMMENU();
            System.out.print("Enter your option:- ");
            int option = sc.nextInt();
            ATM.selectoption(option);
            System.out.println();

        }
    }

}

