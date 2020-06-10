import java.util.*;
import java.util.stream.Collectors;

public class CountTriplets {

    static long countTriplets2(List<Long> arr, long r) {
       return arr.stream().flatMap(x -> arr.stream().flatMap(y -> arr.stream().map(z -> {
                    if (x * r == y && y * r == z) return Optional.of(Arrays.asList(x, y, z));
                    else return Optional.empty();
                }
        ))).filter(i->i!=Optional.empty()).count();

    }

    static long countTriplets3(List<Long> arr, long r) {
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

    static long countTriplets(List<Long> arr, long r){
        long counter=0;
        Map<Long, Long> nextMap = arr.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        Map<Long, Long> previousMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            Long firstterm=0L,thirdterm=0L;

            nextMap.put(arr.get(i),nextMap.getOrDefault(arr.get(i),0L)-1);

            if(previousMap.containsKey(arr.get(i)/r)&&(arr.get(i)%r==0)) firstterm=previousMap.get(arr.get(i)/r);
            if(nextMap.containsKey(arr.get(i)*r))  thirdterm=nextMap.get(arr.get(i)*r);

            counter+=firstterm*thirdterm;

            previousMap.put(arr.get(i),previousMap.getOrDefault(arr.get(i),0L)+1);


        }
        return counter;

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
        List<Long> e=Arrays.asList(1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L);
        System.out.println(countTriplets(e,1));

        List<Long> a1=Arrays.asList(1L, 3L, 9L, 9L ,27L, 81L);
        System.out.println(countTriplets3(a1,3));
        List<Long> b1=Arrays.asList(1L, 5L, 5L, 25L, 125L);
        System.out.println(countTriplets3(b1,5));
        List<Long> c1=Arrays.asList(1L, 2L, 2L, 4L);
        System.out.println(countTriplets3(c1,2));
        List<Long> d1=Arrays.asList(1L, 4L, 16L, 64L);
        System.out.println(countTriplets3(d1,4));
        List<Long> e1=Arrays.asList(1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L, 1L,1L);
        System.out.println(countTriplets3(e1,1));
    }
}
