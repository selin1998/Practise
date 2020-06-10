import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        Map<Integer, List<Integer>> map = IntStream.range(0, a.length).boxed().collect(Collectors.groupingBy(i -> a[i]));
        int[] minDistance={Integer.MAX_VALUE};
        map.values().stream().filter(i->i.size()>1).forEach(j->IntStream.range(1,j.size()).boxed().forEach(k->{
            minDistance[0]=(j.get(k)-j.get(k-1)<minDistance[0])?j.get(k)-j.get(k-1):minDistance[0];
        }));
        return  (minDistance[0]==Integer.MAX_VALUE)?-1:minDistance[0];


    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
        int[] b={7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(new int[]{3,2,1,2,3}));
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4}));
    }
}
