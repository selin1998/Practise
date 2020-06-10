import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidString {

    static String isValid(String s) {

        Map<Character, Long> frequency = s.codePoints().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Map<Long, Long> frequencyofValues = frequency.values().stream()
                .collect(Collectors.groupingBy(i -> i,
                Collectors.counting()
        ));
        if(frequencyofValues.size()==1 || frequencyofValues.size()==0){
            return "YES";
        }
       else if(frequencyofValues.size()==2 && Collections.max(frequencyofValues.keySet())-Collections.min(frequencyofValues.keySet())==1 && frequencyofValues.values().contains((long)1)  ){
          return "YES";
        }
        else {
            return "NO";
        }

    }

    public static void main(String[] args) {


        String result = isValid("abcdefghhgfedecba");
        System.out.println(result);
        String result2 = isValid("aabbccddeefghi");
        System.out.println(result2);
        String result3 = isValid("aabbcd");
        System.out.println(result3);
        String result4 = isValid("abc");
        System.out.println(result4);
        String result5 = isValid("abcc");
        System.out.println(result5);
        String result6 = isValid("abccc");
        System.out.println(result6);
        String result7 = isValid("a");
        System.out.println(result7);
        String result8 = isValid("aaaabb");
        System.out.println(result8);
    }
}
