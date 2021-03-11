import java.util.Scanner;
public class GenericTest_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenericStack2<String> stack= new GenericStack2<>();
        for (int i = 0; i <5 ; i++) {
            stack.push(sc.nextLine());
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
            System.out.println();
        }
    }
}
