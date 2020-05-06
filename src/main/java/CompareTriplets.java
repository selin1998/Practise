import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        AtomicInteger count1= new AtomicInteger();
        AtomicInteger count2= new AtomicInteger();

        IntStream.range(0,a.size()).forEach(i->{
            count2.addAndGet((a.get(i) < b.get(i)) ? 1 : 0);
            count1.addAndGet((a.get(i) > b.get(i)) ? 1 : 0);
        });

        return Arrays.asList(count1.intValue(),count2.intValue());
    }

    public static void main(String[] args) {
        List<Integer> data1 =
                Arrays.asList(1, 2, 3,3);
        List<Integer> data2 =
                Arrays.asList(4, 2, 7,1);

        System.out.println(compareTriplets(data1,data2));
    }

}
