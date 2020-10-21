
import java.util.Scanner;
public class probno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i]=Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==0){
                for (int j = i; j <array.length-1 ; j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
}
