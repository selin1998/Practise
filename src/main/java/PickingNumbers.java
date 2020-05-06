import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        List<Integer> integers = IntStream.range(0, a.size()).boxed().map(i -> Collections.frequency(a, a.get(i)) + Collections.frequency(a, a.get(i) + 1)).distinct().collect(Collectors.toList());
//        System.out.println(integers);
        return Collections.max(integers);

    }
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,1,1,2,2,4,4,5);
        System.out.println(pickingNumbers(a));
        List<Integer> b= Arrays.asList(4, 6, 5 ,3 ,3, 1);
        System.out.println(pickingNumbers(b));
        List<Integer> c= Arrays.asList(1 ,2, 2 ,3 ,1, 2);
        System.out.println(pickingNumbers(c));

    }
}
