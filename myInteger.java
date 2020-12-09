public class myInteger {
    private int value;

    public myInteger(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
    public boolean isOdd(){
    if (value%2!=0) {
        return true;
    }
    return false;
    }
    public boolean isEven(){
        if (value%2==0){
            return true;
        }
        return false;
    }
    public boolean isPrime(){
        for (int i = 2; i <=this.getValue()/2; i++) {
            if (this.value%i==0){
                return false;
            }

        }
        return true;
    }


    public static boolean isOdd(int value){
        if (value%2!=0) {
            return true;
        }
        return false;
    }
    public static boolean isEven(int value){
        if (value%2==0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int value){
        for (int i = 2; i <=value/2; i++) {
            if (value%i==0){
                return false;
            }

        }
        return true;
    }


    public static boolean isOdd(myInteger value){
       return myInteger.isOdd(value.getValue());
    }

    public static boolean isEven(myInteger value){
       return myInteger.isEven(value.getValue());
    }

    public static boolean isPrime(myInteger value) {
    return  myInteger.isPrime(value.getValue());
    }

    static int toInt(char[] array){
        return myInteger.toInt(new String(array));
    }
    static int toInt(java.lang.String array){
        return Integer.parseInt(array);
    }


}
