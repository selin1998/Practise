import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Traffic {

   static class Car{
        int front;
        int back;

        public Car(int front, int back) {
            this.front = front;
            this.back = back;
        }

       @Override
       public String toString() {
           return "Car{" +
                   "front=" + front +
                   ", back=" + back +
                   '}';
       }
   }

    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {
        List<Car> cars = IntStream.range(0, start.size()).mapToObj(i -> new Car(finish.get(i),start.get(i))).collect(Collectors.toList());
        List<Car> cars2 = cars.stream().sorted((o1, o2) -> o1.back - o2.back).collect(Collectors.toList());
      //  System.out.println(cars2);
        List<Integer> collect = IntStream.range(0, cars2.size() -1).boxed().mapToInt(i -> cars2.get(i + 1).back - cars2.get(i).front).boxed().collect(Collectors.toList());
      //  System.out.println(collect);
        int mina = start.stream().mapToInt(i -> i).min().getAsInt();
        int maxa = finish.stream().mapToInt(i -> i).max().getAsInt();
        int m = Math.max(mina - 1, n - maxa);
        return Math.max(collect.stream().mapToInt(i->i).max().getAsInt()-1, m);
    }
    public static void main(String[] args) {
        System.out.println(widestGap(10, Arrays.asList(1, 2, 6, 6),Arrays.asList(4, 4, 10, 8) ));

        System.out.println(widestGap(10, Arrays.asList(1,2,5,8),Arrays.asList(2,2,6,10) ));

        System.out.println(widestGap(10, Arrays.asList(3,8),Arrays.asList(4,9) ));
    }
}
