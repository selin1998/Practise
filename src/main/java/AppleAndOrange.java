import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;


public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate pr= x-> x >= s  &&  x <= t;
        long count_apple = Arrays.stream(apples).map(apple -> a + apple).filter(pr).count();
        long count_orange = Arrays.stream(oranges).map(orange ->  b + orange).filter(pr).count();
        System.out.printf("%d\n%d", count_apple, count_orange);

    }

    public static void main(String[] args) {
            countApplesAndOranges(7,11,5,15, new int[]{-2, 2 ,1},new int[]{5, -6});
    }
}
