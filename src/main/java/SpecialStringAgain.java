import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SpecialStringAgain {


    static boolean isSpecial(String s){
        char a=s.charAt(0);

        if((s.length()&1)==0 ) return  s.codePoints().mapToObj(i -> (char)i).allMatch(x -> x == a);

        else return  IntStream.range(0,s.length()).filter(i->i!=s.length()/2).mapToObj(i->s.charAt(i)).allMatch(t->t==a);
     }


    static long substrCount(int n, String s) {
        List<String> substrings = IntStream.range(0, n+1 ).boxed().flatMap(x -> IntStream.range(0, n+1).boxed().map(y -> {
         if(x<y) return  s.substring(x, y);
         else return " ";
        })).filter(w->isSpecial(w)).collect(Collectors.toList());
        substrings.removeIf(x->x.equals(" "));
        return substrings.size();

    }

    public static void main(String[] args) {

        System.out.println(substrCount(5,"asasd"));
        System.out.println(substrCount(4,"aaaa"));
        System.out.println(substrCount(6,"hannah"));
        System.out.println(substrCount(7,"abcbaba"));
        System.out.println(substrCount(8,"mnonopoo"));
        System.out.println(isSpecial("aaa"));
        System.out.println(isSpecial("a"));
        System.out.println(isSpecial("bbbb"));
        System.out.println(isSpecial("aacaa"));
        System.out.println(isSpecial("abcba"));
        String s="aacaa";

    }
}
