import java.util.stream.IntStream;

public class UtopianTree {

    static int utopianTree(int n) {
        final int[] a = {1};
        IntStream.rangeClosed(1,n).boxed().forEach(i->{
            a[0] =(i%2==1)? a[0] *2: a[0] +1;
        });
        return a[0];

    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5));
        System.out.println(utopianTree(2));
    }
}
