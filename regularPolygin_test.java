import java.util.Scanner;
public class regularPolygin_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RegularPolygon test1=new RegularPolygon();
        RegularPolygon test2=new RegularPolygon(6,4);
        RegularPolygon test3=new RegularPolygon(10,4,5.6,7.8);
        System.out.printf("Perimeter: %.2f  Area: %.2f%n",test1.getPerimeter(),test1.getArea());
        System.out.printf("Perimeter: %.2f  Area: %.2f%n",test2.getPerimeter(),test2.getArea());
        System.out.printf("Perimeter: %.2f  Area: %.2f%n",test3.getPerimeter(),test3.getArea());


    }
}
