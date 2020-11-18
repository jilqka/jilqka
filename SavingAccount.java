public class SavingAccount {
    private double balance;
    private String name;
    private double rate = 0.1;

    public void deposit(double sum) {
        balance += sum;
        System.out.printf("Deposit is : %.2f %n",sum);
    }

    public void withdraw(double sum) {
        if (sum > balance || sum < 0) {
            System.out.println("Error");
            return;
        }
        balance -= sum;
        System.out.printf("Successful withdraw %.2f. Balance is %.2f %n", sum, balance);

    }
}






