import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.stream(ar).forEach(i->map.merge(i,1, Integer::sum));
        return map.values().stream().map(x->x/2).collect(Collectors.summingInt(Integer::intValue));

    }
    static int sockMerchant2(int n, int[] ar) {
        Map<Integer, Long> map = Arrays.stream(ar).boxed().collect(groupingBy(i -> i, Collectors.counting()));
        return map.values().stream().map(x->x/2).collect(Collectors.summingInt(Long::intValue));

    }
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10 ,20 ,20 ,10 ,10 ,30 ,50, 10, 20}));
    }
}
