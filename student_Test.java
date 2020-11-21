import java.util.Scanner;
public class student_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      Student[] allStudents=new Student[5];
        for (int i = 0; i <allStudents.length ; i++) {
            String name=sc.nextLine();
            double grade=Double.parseDouble(sc.nextLine());
            allStudents[i]=new Student(name,grade);
        }
        dispayStudents(allStudents);
    }
    public static boolean accepted(Student Student){
        if (Student.average>=5.50){
            return true;
        }
        return false;
    }
    public static void dispayStudents(Student[] allStudents) {
        for (Student s:allStudents) {
            if (accepted(s)){
                System.out.println(s.name);
            }
        }
    }

}
