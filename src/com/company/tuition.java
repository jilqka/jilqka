package com.company;
import java.util.Scanner;
public class tuition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double initialTuition=10000;
        double increasePer=0.06;
        double future=initialTuition;
        for (int i = 0; i <10 ; i++) {
            future+=future*increasePer;
        }
        double allTuition=0;
        for (int i = 0; i <4 ; i++) {
            allTuition+=future;
            future+=future*increasePer;
        }
        System.out.printf("A four year study in 10 years will cost %.02f",allTuition);

    }
}
