import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountTriplets {

    static long countTriplets2(List<Long> arr, long r) {
       return arr.stream().flatMap(x -> arr.stream().flatMap(y -> arr.stream().map(z -> {
                    if (x * r == y && y * r == z) return Optional.of(Arrays.asList(x, y, z));
                    else return Optional.empty();
                }
        ))).filter(i->i!=Optional.empty()).count();

    }

    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Integer> occurence = new HashMap<>();
        arr.forEach(x -> occurence.merge(x, 1, Integer::sum));
     //   System.out.println(occurence);
        long countTriplet = arr.stream().distinct().map(i -> {
            if (occurence.containsKey(i * r) && occurence.containsKey(i * r * r)){
                return occurence.get(i)* occurence.get(i * r)* occurence.get(i * r * r);
            }
            else return 0;
        }).collect(Collectors.summingLong(Integer::intValue));

        return countTriplet;

    }

    public static void main(String[] args) {
        List<Long> a=Arrays.asList(1L, 3L, 9L, 9L ,27L, 81L);
        System.out.println(countTriplets(a,3));
        List<Long> b=Arrays.asList(1L, 5L, 5L, 25L, 125L);
        System.out.println(countTriplets(b,5));
        List<Long> c=Arrays.asList(1L, 2L, 2L, 4L);
        System.out.println(countTriplets(c,2));
        List<Long> d=Arrays.asList(1L, 4L, 16L, 64L);
        System.out.println(countTriplets(d,4));
    }
}
