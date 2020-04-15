import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;

public class Parking {

    public static long carParkingRoof(List<Long> cars, int k) {
        long distance = Integer.MAX_VALUE;
        Collections.sort(cars);
        for (int i = 0; i <= cars.size() - k  ; i++) {

            distance = Math.min(distance, cars.get(k+i -1) - cars.get(i));
        }
        distance++;

        return distance;
    }

    public static long carParkingRoof2(List<Long> cars, int k) {
        return IntStream.range(0, cars.size() - k).mapToObj(i -> cars.get(i + k - 1) - cars.get(i) +1).min(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int)(o1-o2);
            }
        }).orElseThrow(() -> new RuntimeException());
    }


    public static void main(String[] args) {
        List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);
        long r = carParkingRoof(cars, 3);
        System.out.println(r); // 6
        long r2 = carParkingRoof2(cars, 3);
        System.out.println(r2);

    }
}
