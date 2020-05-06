import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlusMinus {

    public static double format (Map<String,Long> h, String s, int size){
        return (double)h.getOrDefault(s,0L)/size;
    }

    static void plusMinus(int[] arr) {
        int s=arr.length;
        Map<String, Long> posNegZero =Arrays.stream(arr).boxed().
        collect(Collectors.groupingBy(new Function<Integer, String>() {
         @Override
         public String apply(Integer a) {
             if (a < 0) return "LT0";
             if (a > 0) return "GT0";
             return "ZE";
         }}, Collectors.counting()));
        System.out.printf("%.6f\n%.6f\n%.6f\n",format(posNegZero,"GT0",s),format(posNegZero,"LT0",s),format(posNegZero,"ZE",s));

    }



    public static void main(String[] args) {

        plusMinus(new int[]{-4, 3, -9, 0, 4 ,1 });
        plusMinus(new int[]{-4, -3, -9, -6, -4 ,-1 });
    }
}
