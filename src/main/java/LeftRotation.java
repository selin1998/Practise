import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

      int[] b=Arrays.copyOf(a,a.length);
        for (int i = d; i < b.length+d; i++) {
            int newIndex=(i+b.length-d)%b.length;
            b[newIndex]=a[i%a.length];
        }

        return b;
    }


    public static void main(String[] args) {
        System.out.println(rotLeft(new int[]{1, 7, 4, 2, 3}, 4));
        System.out.println(rotLeft(new int[]{1, 2,3,4,5}, 4));

    }
}
