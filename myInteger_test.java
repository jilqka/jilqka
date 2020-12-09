public class myInteger_test {
    public static void main(String[] args) {
        myInteger i=new myInteger(5);
        System.out.println(i.getValue());
        System.out.println(i.isEven());
        System.out.println(i.isOdd());
        System.out.println(i.isPrime());
        System.out.println(i.equals(7));
    }
}
