import java.util.Date;

public class Account {
    private static  double yearInterestRate;
    private int id;
    private double balance;
    private Date date=new Date();
    public Account(){
        this.id=0;
        this.balance=0;
        this.yearInterestRate=0;
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        this.yearInterestRate=0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(double yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void withdraw(double withdraw){
        setBalance(this.balance-withdraw);

    }
    public void deposit(double deposit){
       setBalance(this.balance+deposit);
    }
    public double getMonthlyInterestRate(){
        return yearInterestRate/12;
    }
    public double getMonthyInterest(){
        return getMonthlyInterestRate()*balance;
    }
    public Date dateCreated()  {
        return date;
    }

}
