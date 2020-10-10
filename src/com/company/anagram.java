package com.company;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mes1=sc.nextLine();
        String mes2=sc.nextLine();
        sc.close();
        boolean anagram=true;
        String copymassage2=mes2;
        int lengthMes1=mes1.length();

        for (int i = 0; i <lengthMes1 ; i++) {
            char charInMess1=mes1.charAt(i);
            if (charInMess1>'a'&&charInMess1<'z'||charInMess1>'A'&&charInMess1<'Z') {
            int positionMes2=copymassage2.indexOf(charInMess1);
            if (positionMes2==-1){
                anagram=false;
                break;
            }
            else {
                copymassage2=copymassage2.substring(0,positionMes2)+copymassage2.substring(positionMes2+1);
                System.out.println(copymassage2);
            }
            }
        }

        if (anagram) {
            int charsLeftMes2 = copymassage2.length();
            for (int i = 0; i < charsLeftMes2; i++) {
                char currentChar = copymassage2.charAt(i);
                if (currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
                    anagram = false;
                    break;
                }
            }
        }
        System.out.println(anagram ? "is anagram": "isn't an anagram");

    }
}
