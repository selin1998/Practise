import java.util.Arrays;
import java.util.Optional;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        Integer max = Arrays.stream(ar).boxed().max((o1, o2) -> o1 - o2).get();
        long count = Arrays.stream(ar).filter(i -> i == max).count();
        return (int)count;
    }


    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{7,2,5,6,7,5,7}));
    }

}
