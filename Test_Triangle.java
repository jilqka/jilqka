import java.util.Scanner;
public class Test_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side a of the triangle");
        double a=sc.nextDouble();
        System.out.println("Input side b of the triangle");
        double b=sc.nextDouble();
        System.out.println("Input side c of the triangle");
        double c=sc.nextDouble();
        System.out.println("Input color of the triangle");
        String color=sc.next();
        System.out.println("Input if triangle is filled (true/false)");
        boolean filled=sc.nextBoolean();
        Triangle triangle=new Triangle(a,b,c);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println(triangle.printTriangle()+"\n"+triangle.toString());
    }
}
