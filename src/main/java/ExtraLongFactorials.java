import java.math.BigInteger;

public class ExtraLongFactorials {

    static BigInteger extraLongFactorials(int n) {
        if(n==1) return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(extraLongFactorials(n-1));
    }

    public static void main(String[] args) {
        System.out.println(extraLongFactorials(25));
    }
}
