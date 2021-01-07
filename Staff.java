import java.util.Date;
public class Staff extends Employee{
    private String staffTitle;
    public Staff(String name,
                 String address,
                 String phoneNumber,
                 String email,
                 String office,
                 double salary,
                 String staffTitle) {
        super(name, address, phoneNumber, email, office, salary);
        this.staffTitle=staffTitle;
    }
    public String toString(){
        return super.toString()+"\n"+"staff tittle "+staffTitle;
    }
}
