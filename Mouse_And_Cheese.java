import java.util.Scanner;
public class Mouse_And_Cheese {

        static int mRow=0;
        static int mCol=0;
        static int cheeseCount=0;
        static int allCheese=0;
        static int out=0;



    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

         int size=Integer.parseInt(sc.nextLine());

        char[][] matrix=new char[size][size];

        for (int i = 0; i <size ; i++) {
            String line=sc.nextLine();
            matrix[i]=line.toCharArray();
            if (line.contains("M")){
                mRow=i;
                mCol=line.indexOf("M");
            }
           for (char c : matrix[i]) {
                if (c=='c'){
                    allCheese++;
                }
            }

        }

        String commands=sc.nextLine();

        while (!commands.equals("end")){

            if (commands.equals("up")){
                moveMouse(matrix,mRow-1,mCol);
            }
            else if (commands.equals("down")){
                moveMouse(matrix,mRow+1,mCol);
            }
           else if (commands.equals("left")){
                moveMouse(matrix,mRow,mCol-1);
            }
            else if (commands.equals("right")){
                moveMouse(matrix,mRow,mCol+1);
            }
            if (out==-1){
                break;
            }

            commands= sc.nextLine();
        }

        if (cheeseCount>=5){
            System.out.printf("Great job, the mouse is fed %d cheeses!.%n",cheeseCount);
        }
        if (cheeseCount<5&&cheeseCount<allCheese){
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5-cheeseCount);
        }

        printMatrix(matrix,size,size);


    }

    private static void printMatrix(char[][] matrix, int r, int c) {
        // Loop through all rows
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void moveMouse(char[][] matrix, int newRow, int newCol) {

        if (outOfBounds(matrix,newRow,newCol)){
            System.out.println("Where is the mouse?");
            matrix[mRow][mCol]='-';
            return;
        }

        if (matrix[newRow][newCol]=='B'){
            matrix[newRow][newCol]='-';
            if (newRow==mRow-1){
                newRow--;
            }
            else if (newRow==mRow+1){
               newRow++;
            }
            else if (newCol==mCol-1){
               newCol--;
            }
            else if (newCol==mCol+1){
                newCol++;
            }
          }

        if (matrix[newRow][newCol]=='c'){
            matrix[mRow][mCol]='-';
            matrix[newRow][newCol]='-';
            cheeseCount++;
        }
        else {
            matrix[mRow][mCol]='-';
            matrix[newRow][newCol]='M';
        }


        mRow=newRow;
        mCol=newCol;
    }


    private static boolean outOfBounds(char[][] matrix, int r, int c) {
        return (r<0||r>= matrix.length)||(c<0||c>=matrix[r].length);
    }
}
