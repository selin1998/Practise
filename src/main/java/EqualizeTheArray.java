import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {
        Map<Integer, Long> frequency = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Long max = frequency.values().stream().max(Comparator.comparingLong(a -> a)).orElseThrow(RuntimeException::new);
        return (int)(arr.length-max);

    }
    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{3,3,1,2,3}));
    }
}
