import sun.net.www.content.text.Generic;

import java.util.Scanner;

public class GenericTest {
    public static void main(String[] args) {
        GenericStack<String> stack=new GenericStack<>();
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            stack.push(sc.nextLine());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(stack.pop());
        }

    }
}
