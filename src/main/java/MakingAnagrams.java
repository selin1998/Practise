import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2) {
        Map<Character, Long> s1_freq = s1.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Map<Character, Long> s2_freq = s2.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Set<Character> characters = new HashSet<>(s1_freq.keySet());
        characters.addAll(s2_freq.keySet());
        int num0fDeletions=0;
        for (Character character : characters) {
            num0fDeletions+=(s1_freq.get(character)==null)?s2_freq.get(character):(s2_freq.get(character)==null)?s1_freq.get(character):Math.abs(s1_freq.get(character)-s2_freq.get(character));
        }
        return num0fDeletions;
    }
    public static void main(String[] args) {
        System.out.println(makingAnagrams("aabrteyysy", "yrhheeuo"));
        System.out.println(makingAnagrams("abd", "bce"));
    }
}
