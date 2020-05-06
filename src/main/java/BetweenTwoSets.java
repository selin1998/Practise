import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;

public class BetweenTwoSets {

  static  int gcd(int a, int b) {
      while (b > 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
    }

    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int maxOfa=Collections.max(a);
        int minOfb= Collections.min(b);

        final int[] gcd = {b.get(0)};
        final int[] lcm = {a.get(0)};

        IntStream.range(0,a.size()).forEach(i->{
            lcm[0] =lcm(a.get(i), lcm[0]);
        });

        IntStream.range(0,b.size()).forEach(i->{
            gcd[0] =gcd(b.get(i),gcd[0]);
        });

        return  (int)IntStream.rangeClosed(maxOfa,minOfb).boxed().map(i->{
              return (i%lcm[0]==0)&&(gcd[0]%i==0)?1:0;
        }).filter(x->x==1).count();

    }
    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2, 4),Arrays.asList(16 ,32 ,96)));
    }
}
