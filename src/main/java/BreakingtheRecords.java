import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class BreakingtheRecords {

    public static class Storage{
        int min;
        int max;
        int count_min=0;
        int count_max=0;

        public Storage(int firstElementInArray) {
            this.min = firstElementInArray;
            this.max = firstElementInArray;
        }
    }

    static int [] breakingRecords2(int[] scores) {
        Storage s=new Storage(scores[0]);
        Arrays.stream(scores).forEach(x->{
            if(x < s.min) {
                s.min=x;
                s.count_min=s.count_min+1;
            }
            if(x > s.max) {
                s.max=x;
                s.count_max=s.count_max+1;
            }
        });
        return new int[]{s.count_max,s.count_min};
    }

    static int [] breakingRecords(int[] scores) {
        AtomicInteger min= new AtomicInteger(scores[0]);
        AtomicInteger max=new AtomicInteger(scores[0]);
        AtomicInteger count_min = new AtomicInteger(0);
        AtomicInteger count_max= new AtomicInteger(0);

        Arrays.stream(scores).forEach(x->{
            if(x < min.get()) {
                min.set(x);
                count_min.getAndIncrement();
            }
            if(x > max.get()) {
                max.set(x);
                count_max.getAndIncrement();
            }
        });
        return new int[]{count_max.intValue(),count_min.intValue()};
    }


    static int [] breakingRecords3(int[] scores) {
        Storage s=new Storage(scores[0]);
        IntConsumer process = x -> {
            if(x < s.min) {
                s.min=x;
                s.count_min=s.count_min+1;
            }
            if(x > s.max) {
                s.max=x;
                s.count_max=s.count_max+1;
            }
        };
        Arrays.stream(scores).forEach(process);
        return new int[]{s.count_max,s.count_min};
    }

    public static void main(String[] args) {
        int [] res= {10 ,5 ,20 ,20 ,4 ,5 , 2 ,25 ,1};
        System.out.println(breakingRecords(res));
        int [] res2= {3 ,4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(breakingRecords(res2));
        int [] d=breakingRecords3(new int[]{3 ,4, 21, 36, 10, 28, 35, 5, 24, 42});
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
