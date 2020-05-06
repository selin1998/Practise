import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
      return (int) IntStream.range(0,n).boxed().flatMap(x->IntStream.range(x+1,n).boxed().map(y->{
            return (ar[x]+ar[y])%k==0?1:0;
        })).filter(z->z==1).count();


    }
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6 ,3, new int[]{1 ,3 ,2 ,6 ,1 ,2}));
        System.out.println(divisibleSumPairs(6 ,5, new int[]{1 ,2 ,3 ,4 ,5 ,6}));
    }
}
