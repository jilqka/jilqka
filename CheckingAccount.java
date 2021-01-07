public class CheckingAccount extends Account{
    private double overDraftLimit;
    CheckingAccount (int id,double balance,double overDraftLimit){
       super(id,balance);
       this.overDraftLimit=overDraftLimit;
    }
    public void withdraw(double withdraw){
        if(balance+overDraftLimit>=withdraw){
            setBalance(this.balance-withdraw);
        }
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public String toString(){
        return super.toString()+"Checking account";
    }
}
