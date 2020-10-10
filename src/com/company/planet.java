package com.company;
import java.util.Scanner;
public class planet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight");
        double weight=Double.parseDouble(sc.nextLine());
        System.out.println("Enter planet of the solar system");
        String planet=sc.nextLine();
        double newWeight=0.0;
        switch (planet){
            case "Mercury":
                newWeight=0.38*weight;
                break;
            case "Venus":
                newWeight=0.91*weight;
                break;
            case "Mars":
                newWeight=0.38*weight;
                break;
            case "Jupiter":
                newWeight=2.96*weight;
                break;
            case "Saturn":
                newWeight=0.32*weight;
                break;
            case "Uranus":
                newWeight=0.89*weight;
                break;
            case "Neptune":
                newWeight=1.13*weight;
                break;
        }
        System.out.printf("Your weight on %s is %.2f",planet,newWeight);
    }
}
