package com.company;
import java.util.Scanner;
public class Final_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average;
        int daysAbsent;
        boolean exempt = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("This program will determine if you can get out of the final exam.");
        System.out.println("Please answer the following questions.");
        System.out.println("What is your average in the class?");
        average = reader.nextDouble();
        System.out.println("How class lectures have you missed?");
        daysAbsent = reader.nextInt();
        if (average >= 90&&daysAbsent<=3||average>-80 && daysAbsent<=0) {
            System.out.println("Congratulations! You are exempt from the final exam.");
        }
        else
            System.out.println("You are not exempt from the final exam.");
    }
}



