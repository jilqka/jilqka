import java.util.Scanner;
public class Fan_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fan test1 = new Fan();
        test1.on();
        test1.setRadius(4);
        test1.setColor("blue");
        test1.setSpeed(test1.MEDIUM);
        System.out.println(test1.toString());
    }
}
