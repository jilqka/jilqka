import java.util.Scanner;
public class Course_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");


        System.out.println("Number of students in course 1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        course1.dropSudents("Peter Jones");
        System.out.println("Number of students in course 1: "
                + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course 2: "
                + course2.getNumberOfStudents());


    }
}
