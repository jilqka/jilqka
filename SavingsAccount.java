public class SavingsAccount extends Account {
    SavingsAccount (int id,double balance){
        super(id,balance);
    }

    public void withdraw(double withdraw){
        if(balance>=withdraw){
            setBalance(this.balance-withdraw);
        }
    }
    public String toString(){
        return super.toString()+" Savings account";
    }
}
