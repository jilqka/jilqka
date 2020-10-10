import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width");
        double width =Double.parseDouble(sc.nextLine());
        System.out.println("Enter height");
        double height=Double.parseDouble(sc.nextLine());
        System.out.println("Enter length");
        double length=Double.parseDouble(sc.nextLine());

        int insideArea=(int) Math.ceil(width*length +2*((width*length)*height));
        int fiveLitBucket=0;
        int oneLitBucket=0;
        fiveLitBucket+=insideArea/140;
        int left=insideArea%140;
        if (left%30!=0){
            oneLitBucket=left/30+1;
        }else {
            oneLitBucket=left/30;
        }
        if (oneLitBucket*4>15){
            oneLitBucket=0;
            fiveLitBucket += 1;
        }
        System.out.printf("You need %d five liter buckets and %d one liter buckets",fiveLitBucket,oneLitBucket);


    }
}
