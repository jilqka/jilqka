import java.util.Scanner;

public class saving_account_Action {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingAccount nikola=new SavingAccount();
        nikola.deposit(1000);
        nikola.withdraw(1200);

    }
}
