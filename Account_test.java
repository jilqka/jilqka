import java.text.ParseException;
import java.util.Scanner;
public class Account_test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        Account account=new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setYearInterestRate(4.5/100);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("Balance: %.2f%nMonthly rate:%.2f%%%n",account.getBalance(),account.getMonthyInterest());
        System.out.println(account.dateCreated());


    }
}
