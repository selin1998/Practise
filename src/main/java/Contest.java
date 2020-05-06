import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Contest {

    public static boolean isPrime(long n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,12,14};
        Integer sum = IntStream.range(0, 7).boxed().flatMap(i -> IntStream.range(0, 7).boxed().map(j -> {
            if (j > i && isPrime(j - i)) {
                return arr[j] - arr[i];
            } else return 0;
        })).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
        System.out.println(isPrime(1));
    }
}
