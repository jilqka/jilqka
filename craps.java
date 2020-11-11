import java.util.Scanner;
public class craps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstDice=Integer.parseInt(sc.nextLine());
        int secondDice= sc.nextInt();
        score(firstDice,secondDice);
    }
    private static int score(int a,int b){
        Scanner sc=new Scanner(System.in);
        int result=a+b;
        if (result==7||result==11){
            System.out.printf("You rolled %d + %d = %d%n",a,b,result);
            System.out.println("You win");
        }
        else if (result==2||result==3||result==12){
            System.out.printf("You rolled %d + %d = %d%n",a,b,result);
            System.out.println("You lose");
        }
        else {
            System.out.printf("You rolled %d + %d = %d%n",a,b,result);
            System.out.println("point is "+result);
            int A=Integer.parseInt(sc.nextLine());
            int B=Integer.parseInt(sc.nextLine());
            int newResult=A+B;

            if (newResult==7){
                System.out.printf("You rolled %d + %d = %d%n",A,B,newResult);
                System.out.println("You lose");
            }
            else {
                System.out.printf("You rolled %d + %d = %d%n",A,B,newResult);
                System.out.println("You win");
            }
        }
        return result;
    }

}
