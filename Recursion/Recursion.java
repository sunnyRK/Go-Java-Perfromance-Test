
import java.math.BigInteger;
import java.util.*;

class Rec {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger number = BigInteger.valueOf(n);
        long before = System.currentTimeMillis();
        BigInteger result = fact(number);
        long after = System.currentTimeMillis();
        System.out.println("Elapsed Time: "+(after - before)/1000);
        // System.out.println("Result: "+result);
    }

    public static BigInteger fact(BigInteger number){
        if(number.compareTo(BigInteger.ONE)==0){
            return BigInteger.ONE;
        }else{
            return number.multiply(fact(number.subtract(BigInteger.ONE)));
        }
    }
}