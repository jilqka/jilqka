import java.util.Scanner;
public class arrayleft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numbers=new int[5];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=Integer.parseInt(sc.nextLine());
        }
        int temporary=numbers[0];
        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers[i]=numbers[i+1];

        }
        numbers[numbers.length-1]=temporary;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }
}
