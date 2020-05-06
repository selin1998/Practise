import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {
    static Integer migratoryBirds(List<Integer> arr) {


        Map<Integer, Long> map = arr.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Map.Entry<Integer, Long> birdsWithHighestFrequency = map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, Long>>() {
            @Override
            public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
                return (int) (o2.getValue() - o1.getValue());
            }
        }).findFirst().orElseThrow(RuntimeException::new);
         return birdsWithHighestFrequency.getKey();
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(5,3,2,5,8,2,2,3,5,1)));
    }
}
