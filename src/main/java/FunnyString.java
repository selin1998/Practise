import java.util.Arrays;
import java.util.stream.IntStream;

public class FunnyString {

    static String funnyString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        int[] diff = IntStream.range(1, s.length()).map(i -> Math.abs(s.charAt(i) - s.charAt(i - 1))).toArray();
        int[] diff2 = IntStream.range(1, s.length()).map(i -> Math.abs(stringBuilder.charAt(i) - stringBuilder.charAt(i - 1))).toArray();

        return Arrays.equals(diff,diff2)?"Funny":"Not Funny";
    }


    public static void main(String[] args) {


        System.out.println(funnyString("acxz"));
        System.out.println(funnyString("bcxz"));
        System.out.println(funnyString("lmnop"));
    }
}
