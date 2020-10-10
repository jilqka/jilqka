import java.util.Scanner;
public class pyr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <7 ; i++) {
            for (int j = 7-i; j>0 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j<=7-i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
