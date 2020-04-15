import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        Long min = IntStream.rangeClosed(0, 3).mapToObj(i -> arr[i]).collect(Collectors.summingLong(Integer::intValue));
        Long max = IntStream.rangeClosed(1, 4).mapToObj(i -> arr[i]).collect(Collectors.summingLong(Integer::intValue));
        System.out.print(min+" "+max);
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{396285104, 573261094 ,759641832, 819230764 ,364801279});
    }
}
