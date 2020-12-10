import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account[] all=new Account[10];
        for (int i = 0; i <10 ; i++) {
            all[i]=new Account(i,100);
        }
        int id=0;
        while (true) {
            do {
                System.out.println("Input an id");
                id = sc.nextInt();
            } while (id < 0 || id > 9);
            int option = -1;
            while (option != 4) {
                System.out.println("Main menu\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" +
                        "Enter a choice:");
                option = sc.nextInt();
                if (option == 1) {
                    System.out.println("The balance is " + all[id].getBalance());
                } else if (option == 2) {
                    System.out.println("Amount to withdraw");
                    double withdrawAM = sc.nextDouble();
                    all[id].withdraw(withdrawAM);
                } else if (option == 3) {
                    System.out.println("Amount to deposit");
                    double depositAM = sc.nextDouble();
                    all[id].deposit(depositAM);
                }
            }
        }
    }
}
