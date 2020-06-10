import java.util.Arrays;
import java.util.stream.Collectors;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
      return  Arrays.stream(ar).boxed().collect(Collectors.summingLong(Long::longValue));

    }

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(new long[]{1000000001, 1000000002 ,1000000003 ,1000000004, 1000000005}));
    }
}
