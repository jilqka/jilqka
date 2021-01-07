public class Student extends Person {
    private String freshman;
    private String sophomore;
    private String junior;
    private String senior;
    private String classStatus;
    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus=classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }
    public String toString(){
        return super.toString()+"\n"+"Class status: "+classStatus;
    }
}
