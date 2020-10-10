package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        double wave=Double.parseDouble(sc.nextLine());
        if (wave>=380&&wave<450){
            System.out.println("The color is Violet");
        }
        else if (wave>=450&&wave<495){
            System.out.println("The color is Blue");
        }
        else if (wave>=495&&wave<570){
            System.out.println("The color is Green");
        }
        else if (wave>=570&&wave<590){
            System.out.println("The color is Yellow");
        }
        else if (wave>=590&&wave<620){
            System.out.println("The color is Orange");
        }
        else if (wave>=620&&wave<750){
            System.out.println("The color is Red");
        }
        else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }

    }
}
