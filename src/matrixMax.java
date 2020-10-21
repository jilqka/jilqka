import java.util.Scanner;
public class matrixMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize=3;
        int[][]matrix=new int[arraySize][arraySize];
        for (int i = 0; i <arraySize ; i++) {
            for (int j = 0; j <arraySize ; j++) {
                System.out.println("Enter a number on index"+i+","+j);
                matrix[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i <arraySize ; i++) {
            for (int j = 0; j <arraySize ; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int maxSum=0;
        int IndexmaxSum=0;
        for (int i = 0; i <arraySize ; i++) {
            int currentRow=0;
            for (int j = 0; j <arraySize ; j++) {
                currentRow+=matrix[i][j];
            }
            if (i==0){
                IndexmaxSum=i;
                maxSum=currentRow;
            }
            else if (currentRow>maxSum){
                IndexmaxSum=i;
                maxSum=currentRow;
            }
        }
        System.out.println("The row with the biggest sum is "+IndexmaxSum);
    }
}
