import java.util.Scanner;
public class rnadom20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] randomNum=new int[20];
        for (int i = 0; i <randomNum.length ; i++) {
            randomNum[i]=(int)(Math.random()*20)+1;
        }
        for (int i = 0; i <randomNum.length ; i++) {
            System.out.println(randomNum[i]);
        }
    }
}
