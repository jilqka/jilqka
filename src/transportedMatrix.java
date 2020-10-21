import java.util.Scanner;
public class transportedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=Integer.parseInt(sc.nextLine());
        System.out.println("Enter collums");
        int collums=Integer.parseInt(sc.nextLine());
        int[][] matrix=new int[rows][collums];
        int[][] transposed=new int[collums][rows];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <collums ; j++) {
                System.out.println("Enter a number on index"+i+","+j);
                matrix[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <collums ; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <collums ; j++) {
                transposed[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transposed:");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <collums ; j++) {
                System.out.print(transposed[i][j]+"\t");
            }
            System.out.println();
        }





    }
}
