
import java.math.BigInteger;
import java.util.*;

class Forloop {
    public static void main(String []args){
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int[] allInputs = new int[]{10000, 50000, 100000, 500000, 1000000, 1500000}; 
        for(int i=0;i<allInputs.length;i++){
            BigInteger number = BigInteger.valueOf(allInputs[i]);
            BigInteger result = BigInteger.valueOf(1);
            long before = System.currentTimeMillis();
            for (int j=1;j<=allInputs[i];j++){
                result = result.multiply(BigInteger.valueOf(j));
            }
            long after = System.currentTimeMillis();
            System.out.println("Elapsed Time: "+(after - before)/1000);
        }
        // BigInteger number = BigInteger.valueOf(n);
        // BigInteger result = BigInteger.valueOf(1);
        // long before = System.currentTimeMillis();
        // for (int i=1;i<=n;i++){
        //     result = result.multiply(BigInteger.valueOf(i));
        // }
        // long after = System.currentTimeMillis();
        // System.out.println("Elapsed Time: "+(after - before)/1000);
        // System.out.println("Result: "+result);
    }
}