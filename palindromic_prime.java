
import java.util.Scanner;
public class palindromic_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print();

    }

    private  static boolean isPrime(int number) {

        boolean result = false;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                result = true;
                break;

            }
        }

        if (result) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isPalindromic(int n) {

        int remainder, reversedNum = 0;
        int originalNumber = n;
        while (n != 0) {

            remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;

        }

        if (originalNumber == reversedNum) {

            return true;
        } else {

            return false;
        }
    }

    private static void print() {

        int num = 2;
        int counter = 0;

        while (counter < 120) {
            if (isPrime(num) && isPalindromic(num)) {
                counter++;
                System.out.print(num + " ");
                if (counter % 10 == 0) {
                    System.out.println();
                }

            }

            num++;

        }
    }

}