import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {

    static int makeAnagram___(String a, String b) {
        List<Character> first = a.codePoints().mapToObj(i -> (char) i).collect(Collectors.toList());
        List<Character> second=b.codePoints().mapToObj(i -> (char) i).collect(Collectors.toList());

        List<Character> common = first.stream().filter(x -> second.contains(x)).collect(Collectors.toList());
        first.removeIf(x -> common.contains(x));
        second.removeIf(x->common.contains(x));

       return first.size()+second.size();
    }
    static int makeAnagram(String a, String b) {
        String aa=a;String bb=b;
        for (int i = 0; i < a.length(); i++) {
            if(bb.contains(String.valueOf(a.charAt(i)))){
              aa= aa.replaceFirst(String.valueOf(a.charAt(i)),"");
              bb=  bb.replaceFirst(String.valueOf(a.charAt(i)),"");
            }
        }

        return aa.length()+bb.length();


    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("selin","niles"));
        System.out.println(makeAnagram("aby","cmmay"));
        System.out.println(makeAnagram("cde","abc"));
        System.out.println(makeAnagram("madam","adam"));
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));


    }
}
