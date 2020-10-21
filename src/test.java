import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberStudents=3;
        int numberQuestions=3;
        char[][]answers=new char[numberStudents][numberQuestions];
        char[]keys=new char[numberQuestions];
        for (int i = 0; i <numberQuestions ; i++) {
            System.out.println("Enter answer for question "+(i+1));
            keys[i]=sc.nextLine().charAt(0);
        }
        for (int i = 0; i <numberStudents ; i++) {
            for (int j = 0; j <numberQuestions ; j++) {
                System.out.println("Enter answer for question "+(j+1)+" for student "+(i+1));
                answers[i][j]=sc.nextLine().charAt(0);
            }
        }
        for (int i = 0; i <numberStudents ; i++) {
            int correctCount=0;
            for (int j = 0; j <numberQuestions ; j++) {
                if (answers[i][j]==keys[j]){
                    correctCount++;
                }
            }
            System.out.println("Student "+i+" correct count is "+correctCount);
        }

    }
}
