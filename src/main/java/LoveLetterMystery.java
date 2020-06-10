import java.util.stream.IntStream;

public class LoveLetterMystery {

    static int theLoveLetterMystery(String s) {
        int[]count={0};
        IntStream.range(0,s.length()/2).boxed().forEach(i->{
            count[0]+=Math.abs(s.charAt(i)-s.charAt(s.length()-i-1));
        });
        return count[0];
    }


    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abc"));
    }
}
