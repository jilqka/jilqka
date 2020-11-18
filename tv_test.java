import java.util.Scanner;
public class tv_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TV currentTv=new TV();
        System.out.println("cuurent channel: "+currentTv.channel+" current volume:"+currentTv.volume+" on:"+currentTv.condition);
        currentTv.switchedON();
        currentTv.channelDown();
        currentTv.volumeUp();
        System.out.println("cuurent channel: "+currentTv.channel+" current volume:"+currentTv.volume+" on:"+currentTv.condition);




    }
}
