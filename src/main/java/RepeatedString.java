import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        int len=s.length();
        StringBuilder newString=new StringBuilder();
        LongStream.range(0,n).forEach(i->newString.append((s.charAt((int)i%len))));
        return newString.codePoints().mapToObj(i->(char)i).filter(x->x=='a').count();


    }

    static long repeatedString2(String s, long n) {
        int len=s.length();
        long count = s.codePoints().filter(i -> i == 'a').count();
        return (n/len)*count + s.substring(0,(int)n%len).codePoints().filter(x->x=='a').count();


    }
    public static void main(String[] args) {
        System.out.println(repeatedString2("aba",10));
        System.out.println(repeatedString2("a",1000000000000L));
    }
}
