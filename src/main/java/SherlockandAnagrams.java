import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockandAnagrams {

    static long sherlockAndAnagrams( String s) {
        Map<String, Integer> occurence = new HashMap<>();

        List<String> substrings = IntStream.range(0, s.length() ).boxed().flatMap(x -> IntStream.range(0, s.length()+1 ).boxed().map(y -> {
            if (x < y) return s.substring(x, y);
            else return " ";
        })).collect(Collectors.toList());
        substrings.removeIf(x->x.equals(" "));

        List<String> sortedSubstrings = substrings.stream().map(a -> a.codePoints().mapToObj(i -> (char) i).sorted().map(t -> String.valueOf(t)).collect(Collectors.joining())).collect(Collectors.toList());

        for (int i = 0; i < sortedSubstrings.size(); i++) {
            int count=occurence.containsKey(sortedSubstrings.get(i))?occurence.get(sortedSubstrings.get(i))+1:1;
            occurence.put(sortedSubstrings.get(i),count);
        }


//        System.out.println(substrings.toString());
//        System.out.println(sortedSubstrings.toString());
//        System.out.println(occurence);

        return occurence.values().stream().map(i->(i*(i-1)/2)).collect(Collectors.summingInt(Integer::intValue));

    }


    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("ababcde"));
        System.out.println(sherlockAndAnagrams("abba"));
        System.out.println(sherlockAndAnagrams("cdcd"));
        System.out.println(sherlockAndAnagrams("abcd"));
        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));

    }
}
