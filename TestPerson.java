import java.util.Scanner;
public class TestPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Person person=new Person("Nikola",
               "st.Trakia",
               "088276236",
               "nikolajilov@abv.bg");
       Student student=new Student("Roni",
               "st.Tram",
               "08827272",
               "rangeljilov@abv.bg","senior");
       Employee employee=new Employee("Vaseto",
               "st.lolo",
               "088273552",
               "vaseto@abv.bg","machines",3600);
       Staff staff=new Staff("Pesho",
               "st.guzariq",
               "08717391",
               "pesho@abv.bg","killers",5550,"golden");
       Faculty faculty=new Faculty("Yoankata",
               "st.belchev",
               "0881828913",
               "yoankata@abv.bg","destroyer",8000,"08:00-16:00","challenger");
        System.out.println(person.toString()+"\n");
        System.out.println(student.toString()+"\n");
        System.out.println(employee.toString()+"\n");
        System.out.println(staff.toString()+"\n");
        System.out.println(faculty.toString()+"\n");

    }
}
