import java.util.Arrays;
import java.util.stream.Collectors;


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
        int[] a={1, 7, 4, 2, 3};
        int [] b=new int[a.length];
        int d=2;
        for (int i = 0; i < a.length; i++) {
            b[i]=a[(i+d)%a.length];
        }
        String rotatedArray = Arrays.stream(b).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(" "));
        System.out.println(rotatedArray);
        System.out.println(Arrays.toString(b));

    }
}
