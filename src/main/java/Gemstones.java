import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Gemstones {

    static int gemstones(String[] arr) {
        List<String> strings = Arrays.stream(arr).map(i -> i.codePoints().mapToObj(u->(char)u).map(j -> String.valueOf(j)).distinct().collect(Collectors.joining(""))).collect(Collectors.toList());
        String concatenation = strings.stream().collect(Collectors.joining());
        Map<Character, Long> occurence = concatenation.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return (int)occurence.values().stream().filter(val->val==arr.length).count();

    }
    
    public static void main(String[] args) {
        System.out.println(gemstones(new String[]{"abcd", "rad", "dureta"}));

    }
}
