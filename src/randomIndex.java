import java.util.Scanner;
public class randomIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i <numbers.length ; i++) {
            int randomIndex=(int)(Math.random()*10);
            int swap=numbers[randomIndex];
           numbers[randomIndex]=numbers[i];
           numbers[i]=swap;
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
