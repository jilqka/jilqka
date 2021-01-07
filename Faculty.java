import java.util.Date;
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name,
                   String address,
                   String phoneNumber,
                   String email,
                   String office,
                   double salary,
                   String officeHours,
                   String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    public String toString(){
        return super.toString()+"\n"+"office hours "+officeHours+"rank "+rank;
    }
}
